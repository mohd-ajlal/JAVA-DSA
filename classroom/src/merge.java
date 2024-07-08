public class merge {
    public static void merge(int[] arr1, int[] arr2){
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] arr = new int[l1+l2];

        int i = 0, j = 0, pos = 0;

        while (l1> i && l2 > j){
            if(arr1[i] < arr2[j]){
                arr[pos] = arr1[i];

            }
        }
    }

}
