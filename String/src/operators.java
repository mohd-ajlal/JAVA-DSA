import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
//        integer will be converted into integer that will call toString()
        System.out.println("a" + 1);

        System.out.println("Ajlal" + new ArrayList<>());
    }
}