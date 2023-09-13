// search an element in a sorted matrix


//  if element == target
//      answer
//  if element > target
//      ignore rows after it
//  if element < target
//      ignore rows before it


// in the end two rows are remaining
// 1. Check whether the mid-column you are at contains the answer
// 2. consider the four part

// Time complexity : O(log(N) + lon(M))
public class sorted_matrix {

//    search in the row provided between the column provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]== target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int column = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, column -1, target);
        }



        int rStart = 0;
        int rEnd = rows -1;
        int cMid = column/2;

        //        run the loop till two rows are remaining

        while (rStart < (rEnd -1)){ // while it will true it will have more than two rows
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else {
               rEnd = mid;
            }
        }

//        now we have two rows
//         check whether the column is in the column of two rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }
        //        search in the 1st half
        if(target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //        search in the 2nd half
        if(target >= matrix[rStart+1][cMid-1]  && target <= matrix[rStart][column-1]){
            return binarySearch(matrix, rStart, cMid+1, column-1, target);
        }
        //        search in the 3rd half
        if(target <= matrix[rStart+1][cMid-1]  && target <= matrix[rStart][column-1]){
            return binarySearch(matrix, rStart +1, 0, cMid-1, target);
        }
        //        search in the 4th half
        else {
            return binarySearch(matrix, rStart + 1, cMid-1, column - 1, target);
        }
//        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 1;

        int[] out = search(matrix, target);
        System.out.println(out[0]+ " "+ out[1]);
    }
}
