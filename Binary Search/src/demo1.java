class Solution {
    public int findGCD(int[] nums) {
        int min= nums[0];
        int max = nums[0];
        for(int ele : nums){
            if(ele < min){
                min = ele;
            }
            if(ele>max){
                max = ele;
            }
        }
        while(min!=0){
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
}