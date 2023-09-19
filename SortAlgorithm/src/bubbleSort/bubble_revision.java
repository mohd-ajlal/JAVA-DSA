package bubbleSort;

import java.util.Arrays;

public class bubble_revision {
    static void sort(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i = 0; i<arr.length ; i++){
            swapped = false;
            for(int j = 1; j<=arr.length - i - 1; j++){
                if(arr[j]< arr[j-1]){
                    sort(arr, j, j-1);
//                    System.out.println(Arrays.toString(arr));;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
