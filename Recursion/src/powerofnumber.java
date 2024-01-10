public class powerofnumber {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        int N1 = 2, R1 = 2;
        System.out.println(pow(N1, R1)); // Output: 4

        int N2 = 12, R2 = 21;
        System.out.println(pow(N2, R2)); // Output: 864354781
    }

    static long pow(long n, long p)     {
    int mod = 1000000007;

        if(p==0)
            return 1;

    long ans=0;
        if(p%2 == 0){
        ans = pow(n,p/2);
        ans = ( ans * ans) %mod;
    }

        else{
        ans = n%mod;
        ans =  ( ans * pow (n ,p-1) %mod ) % mod;
    }

        return (ans)%mod;
}
}
