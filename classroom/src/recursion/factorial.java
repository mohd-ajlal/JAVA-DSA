package recursion;

public class factorial {
    static int fact(int num){
        if(num<=1){
            return 1;
        }
        return num * fact(num-1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(fact(num));
    }
}
