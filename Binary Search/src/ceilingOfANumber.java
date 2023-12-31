// Ceiling = smallest element in array equal to or greater than the target element.

import java.rmi.dgc.VMID;
import java.util.Scanner;

public class ceilingOfANumber {
    static int ceil(int[] array, int target){
        int start = 0;
        int end = array.length - 1;

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
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {2,4,5,7,9,12,16,18,20};
//        int[] array = {5,4,2,0,-1,-2,-12,-32};
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int out = ceil(array, target);
        if(out == -1){
            System.out.print("Ceil doesn't exist in array.");
        }else {
            System.out.print("Ceil of " + target + " is " + array[out]);
        }
    }
}
