import java.io.File;
import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("input_01_1.txt"));
        } catch (Exception e) {
            System.out.println("bruh");
            return;
        }
        long res = 0;
        while (sc.hasNext()) {
            res += getNum(sc.nextLine());
        }
        System.out.println(res);
        sc.close();
    }

    public static int getNum(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (48 <= s.charAt(i) && s.charAt(i) <= 57) {
                num = num + ((int) (s.charAt(i)) - 48);
                num = num * 10;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (48 <= s.charAt(i) && s.charAt(i) <= 57) {
                num = num + ((int) (s.charAt(i)) - 48);
                break;
            }
        }
        return num;

    }

}