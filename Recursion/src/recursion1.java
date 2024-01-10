import java.util.Scanner;

public class recursion1 {
    static void fun1(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello");
        fun1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun1(n);
    }
}
