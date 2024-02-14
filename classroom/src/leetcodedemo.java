public class leetcodedemo {
    static void rearrange(int[] arr){
        int size = arr.length;
        int[] newArr = new int[size];
        int p = 0;
        int n = 1;
        for (int j : arr) {
            if (j >= 0) {
                newArr[p] = j;
                p = p + 2;
            } else {
                newArr[n] = j;
                n = n + 2;
            }
        }
        for(int i = 0; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        rearrange(arr);
    }
}
