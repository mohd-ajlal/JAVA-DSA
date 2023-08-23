// 852. Peak index in a mountain array
//   is also called bitonic array.
//example = [0, 2, 1 , 0]
// first increase then  decrease

//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class leetcode852 {
    public static int peakIndexInMountainArray(int[] arr) {
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
    public static void main(String[] args) {
         int[] arr = {0,10,5,2};
         int out = peakIndexInMountainArray(arr);
        System.out.println(out);
    }
}
