public class leetcode410 {

    static int split_array(int nums[], int k){
        int start = 0;
        int end = 0;

        for(int i = 0; i<nums.length; i++){
            start = Math.max(start, nums[i]); // in the end of the loop it will contain the maximum item from the array
            end += nums[i];
        }
//        binary search
        while(start<end){
//        try for the middle as the potential answer
            int mid = start + (end - start)/2;

//            calculate how many pieces you can divide this in with this max sum

            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if(sum + num > mid){
//                    you can't add this in subarray, make new one
//                    say you add this num in new subarray, then num = sum
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces>k){
                start = mid +1;
            }else {
                end = mid;
            }
        }
        return end; // start == end
    }
    public static void main(String[] args) {
        int[] array = {7,2,5,10,8};
        int m = 2;
        int out = split_array(array, m);
        System.out.println(out);
    }
}


/*
class Solution {
    public int splitArray(int[] nums, int m) {
        //range[max(nums), sum(nums)]
        int lo = 0, hi = 0;
        for(int num: nums){
            if(num > lo){
                lo = num;
            }
            hi += num;
        }
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(mIsValid(nums, m, mid)){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return lo;
    }

    private boolean mIsValid(int[] nums, int m, int val){
        //if group into m groups, each group's sum <= val
        int groupNeed = 0, curSum = 0;
        for(int num: nums){
            curSum += num;
            if(curSum > val){
                ++groupNeed;
                curSum = num;
            }
        }
        if(curSum > 0){
            ++groupNeed;
        }
        return groupNeed <= m;
    }
}

//Runtime
//0ms
//Beats 100.00%of users with Java
//Memory
//39.69MB
//Beats 96.54%of users with Java
 */