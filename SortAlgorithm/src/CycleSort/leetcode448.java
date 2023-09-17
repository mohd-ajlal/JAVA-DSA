package CycleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode448 {
    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
//        just find missing mumbers
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> out = findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(new List[]{out}));
    }
}
