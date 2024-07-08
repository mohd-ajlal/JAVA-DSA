package recursion;

public class fibonacci {
    static int fibonacciRecursion(int n){
        if (n <= 1)
            return n;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    static void fibonacciIterative(int n){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i<n-2; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        fibonacciIterative(n);
        System.out.println(n + "th Fibonacci Number: " + fibonacciRecursion(n));
    }
}
