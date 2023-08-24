public class leetcode162 {
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
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int out = findPeakElement(arr);
        System.out.println(out);
    }
}
