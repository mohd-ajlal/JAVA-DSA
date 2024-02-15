package recursion;

public class fibonacci {
    static int fibonacciRecursion(int n){
        if (n <= 1)
            return n;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + "th Fibonacci Number: " + fibonacciRecursion(n));
    }
}
