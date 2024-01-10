public class GP {
    static double termOfGP(int a,int b,int n)
    {
        assert (a >= -100 && a <= 100 && b >= -100 && b <= 100 && n >= 1 && n <= 5);
        double r = b / a;
        return a * power(r, n - 1);
    }
    static double power(double a, int n) {
        double ans = 1, x = a;
        while (n != 0) {
            if ((n & 1) != 0) {
                ans *= x;
            }
            x *= x;
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 84;
        int b = 87;
        int n = 3;
        double out = termOfGP(a, b, n);
        System.out.println(out);}
}
