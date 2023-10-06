public class MaxPathSum {
    public static void main(String[] args) {
        int[] arr = {2,3,7,10,12,15,30,34};
        int[] brr = {1,5,7,8,10,15,16,19};

        int s1 = 0;
        int s2 = 0;

        int i = 0;
        int j = 0;

        int ans = 0;
        while(i<arr.length && j<brr.length){

            if(arr[i] <brr[j]){
                s1 += arr[i];
                i++;
            } else if (brr[j]<arr[i]) {
                s2 += brr[j];
                j++;
            }else{
                ans = ans + Math.max(s1, s2) + arr[i];
                i++;
                j++;
                s1 = 0;
                s2 = 0;
            }
        }
//        System.out.println(ans);

        if(i<arr.length){
            while(i<arr.length){
                s1 += arr[i];
                i++;
            }
        }
        else{
            while(j<brr.length){
                s2+= arr[i];
                j++;
            }
        }
        ans = ans + Math.max(s1, s2);
        System.out.println(ans);
    }
}
