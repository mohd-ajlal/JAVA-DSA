package CycleSort;

import java.util.ArrayList;
import java.util.List;

public class leetcode442 {
    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
   static List<Integer> findDuplicates(int[] nums) {
       int i = 0;
       while(i < nums.length){
           int correct = nums[i] -1;
           if(nums[i] != nums[correct]){
               swap(nums, i, correct);
           }else {
               i++;
           }
       }

       List<Integer> ans = new ArrayList<>();
       for(int index = 0; index<nums.length; index++){
           if(nums[index] != index+1){
               ans.add(nums[index]);
           }
       }
       return ans;
    }
    public static void main(String[] args) {

    }
}
