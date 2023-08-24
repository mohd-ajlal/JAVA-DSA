//https://leetcode.com/problems/find-in-mountain-array/

//The solution from line 86 only submit

//1. Find peak element
//2. Binary search in ascending array
//3. if not found, binary search in decreasing array


public class leetcode1095 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int out = search(arr, target);
        System.out.println(out);
    }

    static int search(int[] arr, int target){
        int peak = findPeakElement(arr);
        int firstTry = binary_search(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        //        try to search in second half
        return binary_search(arr, target, peak+1, arr.length-1);
    }
    static int findPeakElement(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
//                you are in deceasing past of array
//                this may be the answer but look at left
//                this is whu end != mid - 1
                end = mid;
            }else {
//                you are in ascending part if array
                start = mid + 1;
//                bcz we know that mid + 1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest no. because of the 2 checks above
//        start and end are always trying to find max element in the above 2 checks
//        hence, when they are pointing to just one element, i.e. the max one because that is what the checks say
//        more elaboration : at every point of start and end, they have the best possible answer till that point
//        and if we are saying only one item is remaining hence because of above line that is the best possible answer
        return start; // or return end because both are equal
    }

    static int binary_search(int[] arr, int target, int start, int end){

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}




/*
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        //find peak element ans then first find in ascendind array then in descenidnd array using binary
        //for asc(s=0 and end=peak index ) && for des(s=peak ans e=length)
        int peak=peakIndex(mountainArr);
        int firstTry=orderDiagonisticBS(mountainArr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderDiagonisticBS(mountainArr,target,peak+1,mountainArr.length()-1);

    }
    int peakIndex( MountainArray arr){
        int s=0;
        int e=arr.length()-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int a=arr.get(mid);
            if(a<arr.get(mid+1)){
                s=mid+1;
            }else if(a>arr.get(mid+1)){
                e=mid-1;
            }
        }
        return s;
    }
    public int orderDiagonisticBS(MountainArray arr,int target,int s,int e){
        boolean isAsc=false;
        if(arr.get(s)<arr.get(e))
            isAsc= true;
        else
            isAsc =false;
        if(isAsc){    //binary seach
            while(s<=e){
                int mid=s+(e-s)/2;
                int a=arr.get(mid);
                if(a==target){
                    return mid;
                }else if(a<target){
                    s=mid+1;
                }else
                    e=mid-1;
            }
        } else{
            while(s<=e){
                int mid=s+(e-s)/2;
                int a=arr.get(mid);
                if(a==target){
                    return mid;
                }else if(a>target){
                    s=mid+1;
                }else
                    e=mid-1;
            }
        }
        return -1;

    }
}

*/