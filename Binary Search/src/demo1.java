import java.util.Scanner;

public class demo1 {
    public static void smart(int x) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        while (i <= x) {
            int m, n;
            m = scanner.nextInt();
            n = scanner.nextInt();

            if ((m >= 1 && m <= 1000000) && (n >= 1 && n <= 1000000)) {
                int aayush = -1;
                int harsh = 0;

                while (true) {
                    aayush = aayush + 2;
                    harsh = harsh + 2;

                    if (m < aayush) {
                        System.out.println("Harshit");
                        break;
                    } else if (n < harsh) {
                        System.out.println("Aayush");
                        break;
                    }
                }
            }

            i++;
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x >= 1 && x <= 1000) {
            smart(x);
        }

        scanner.close();
    }
}
