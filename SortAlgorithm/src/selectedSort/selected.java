package selectedSort;

import java.util.Arrays;

public class selected {

    static void selectedS(int[] arr){
        for(int i = 0; i<arr.length; i++){
//            find the max item in the remaining array and swap with correct index

            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for(int i = start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectedS(arr);
        System.out.println(Arrays.toString(arr));
    }
}
