// 744. Find Smallest letter greater than target


import java.util.Scanner;

public class leetcode744 {
    static char nextGreatestNumber(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
//            find the middle element
//            int middle = (start + end) /2;   // might be possible that (start + end) excess the range of int in java

            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start %  letters.length];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char out = nextGreatestNumber(letters, target);
        System.out.println(out);
    }
}
