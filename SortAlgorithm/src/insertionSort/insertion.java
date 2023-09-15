package insertionSort;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertionS(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    private static void insertionS(int[] arr) {
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }

    }
}
