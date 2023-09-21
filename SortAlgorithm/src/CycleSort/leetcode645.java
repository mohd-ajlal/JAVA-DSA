package CycleSort;

import java.util.Arrays;

public class leetcode645 {
    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    static int[] findErrorNums(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                return new int[]{nums[index], index+1};
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = {2,2};
        int[] out = findErrorNums(nums);
        System.out.println(Arrays.toString(out));
    }
}
