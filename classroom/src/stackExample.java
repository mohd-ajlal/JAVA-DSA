import java.util.Stack;

public class stackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

//        pushing element onto a stack

        stack.push("Mango");
        stack.push("Mango");
        stack.push("Apple");
        stack.push("orange");

//        display
        System.out.println(stack);

//        popping element
        String poppedElement = stack.pop();
        System.out.println(poppedElement);

//        display
        System.out.println(stack);
    }
}
