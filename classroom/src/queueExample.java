import java.util.LinkedList;
import java.util.Queue;

public class queueExample {
    public static void main(String[] args) {
//        creating queue from linkedlist
        Queue<String> queue = new LinkedList<>();

//        adding element
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

//        display
        System.out.println(queue);

//        remove
        String removedEle = queue.poll();
        System.out.println(removedEle);

//        display
        System.out.println(queue);
    }
}