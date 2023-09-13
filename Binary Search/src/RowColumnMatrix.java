// Matrix is sorted in a row wise and column wise manner
//  10 20 30 40
//  15 25 35 45
//  28 29 37 49
//  33 34 38 50

// target = 37

//  Time Complexity = O(n)

import java.util.Arrays;

// case 1: if element == target
//            answer found
// case 2:  if element < target
//            row++
//  case 3: if element > target
//            column--
public class RowColumnMatrix {

    static int[] search(int[][] array, int target){
        int row = 0;
        int column = array.length - 1;
        while(row< array.length && column >= 0){
            if(array[row][column] == target){
                return new int[]{row, column};
            }
            if(array[row][column] < target){
                row++;
            }else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] array = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 49;
        System.out.println(Arrays.toString(search(array, target)));

    }
}
