package recursion;
import java.util.Arrays;

public class leetcodedemo3 {

    static int check(int[] arr, int i){
        int count = 1;
        for(int j = i; j<arr.length-1; j++){
            if(arr[i] == arr[i+1]){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
//        {1,1,2,3,3,3,4}
        int out = 0;
        int i = 0;
        while(k>0){
//            if(check(arr, i) == 1){
//                out++;
//                i++;
//            }else{
//                while(k!=0){
//
//                }
            int num = check(arr,i);
            if(num == 1){
                out++;
                i++;
            }else{
                k -= num;
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }

}
