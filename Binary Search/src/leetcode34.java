// 34. Find First and Last Position of Element in Sorted Array

public class leetcode34 {
    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

//        check for first occurrence if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    //    this function just return the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) { //remove static while submitting the answer
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
//                potential answer may found
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] out = searchRange(nums, target);
        for (int j : out) {
            System.out.print(j + " ");
        }
    }
}
