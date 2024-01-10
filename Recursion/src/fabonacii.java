public class fabonacii {
    static int fabonaciiRecursion(int n){
        if (n <= 1)
            return n;
        return fabonaciiRecursion(n - 1) + fabonaciiRecursion(n - 2);
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(
                n + "th Fibonacci Number: " + fabonaciiRecursion(n));
    }
}
