
interface functional_int{
    void m1(int a);
}
public class lambda_expression {
    public static void main(String[] args) {
        functional_int p = (a) -> {
            System.out.println("hello m1 :" + (a*2));
        };

        p.m1(10);
    }
}