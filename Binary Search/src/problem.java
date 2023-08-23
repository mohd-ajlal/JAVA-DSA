//Find the position of the element in a sorted array of infinite numbers.

// we can use linear search or binary search - basic approach
//But if we can't use array.length then ->
public class problem {
    static int ans(int[] array, int target){
//        first find the range
//        start with the box of size 2
        int start = 0;
        int end = 1;
        while(target > array[end]){
            int temp = end + 1; // this is my new start
//            double the box value
//            end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return position(array, target, start, end);
    }
    static int position(int[] array, int target, int start, int end){
        while (start<=end){
//            find the middle element
//            int middle = (start + end) /2;   // might be possible that (start + end) excess the range of int in java

            int mid = start + (end - start)/2;
            if (target > array[mid]) {
                start = mid + 1;
            }
            else if (target < array[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,7,9,10,12,15,18,19,20,24,27,29,30};
        int target = 15;

        int out = ans(array, target);
        System.out.println(out);
    }
}
