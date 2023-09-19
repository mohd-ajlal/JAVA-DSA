public class leetcode69 {
    static int sqrt(int x){
//        if (x <= 1) return x;
//        long i = 1;
//        long sq = i * i;
//        while (x >= sq) {
//            i++;
//            sq = i * i;
//        }
//        return (int) (i - 1);
        if(x == 0){
            return 0;
        }
        int start = 1;
        int end = x;
        int ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid <= x/mid){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 9;
        int out = sqrt(x);
        System.out.println(out);
    }
}
