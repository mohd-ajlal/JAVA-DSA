public class Main {
    static void fun1(){
        System.out.println("Hello");
        fun1();
    }
    public static void main(String[] args) {
        System.out.println("Recursion");
        fun1();
    }
}