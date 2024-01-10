import java.util.Scanner;

public class exact3Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int out = exact3Divisors(N);
        System.out.println(out);
    }

    static int exact3Divisors(int N){
        int count = 1;

        if (N <= 3) {
            return 0;
        }

        for (int i = 3; i <= Math.sqrt(N); i++) {

            if (isPrime(i) && (i * i) <= N) {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n){
        if(n==1) return false;
        if (n==2||n==3) return true;
        for(int i = 5; i<=Math.sqrt(n); i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
