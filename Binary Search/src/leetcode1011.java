public class leetcode1011 {

    static int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i<weights.length; i++){
            high += weights[i];
            low =  Math.max(low, weights[i]);
        }

        while (low<=high){

            int mid = low + (high - low)/2;
            if(possible(weights, days, mid)){
             high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    static boolean possible(int[] weights, int days,int capacity) {
        int sum = 0;
        int totalDays = 1;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] + sum > capacity) {
                totalDays++;
                sum = weights[i];
            } else {
                sum += weights[i];
            }
        }
        return totalDays<=days;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int out = shipWithinDays(weights, days);
        System.out.println(out);
    }
}
