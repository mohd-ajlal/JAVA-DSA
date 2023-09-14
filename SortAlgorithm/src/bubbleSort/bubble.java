package bubbleSort;

/*
We can create a java program to sort array elements using bubble sort.
Bubble sort algorithm is known as the simplest sorting algorithm.

In bubble sort algorithm, array is traversed from first element to last element.
Here, current element is compared with the next element.
If current element is greater than the next element, it is swapped.
 */

// Space complexity: O(1) #constant

// Time complexity: O(N) # best case: sorted
// O(N*N) # worst case: sorted in descending order

// Note: When j never swaps for a value of i, it means array is sorted. Hence, you can end the program.

import java.util.Arrays;

public class bubble {

    static void bubbleSort(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for(int i = 0; i<arr.length; i++){
            swapped = false;
//            for each step, max item will come at the last respective index
            for(int j = 1; j<=arr.length - i - 1; j++){
//                swap if the item is smaller than the previous item
                if(arr[j]< arr[j-1]){
//                    swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//            if you not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
