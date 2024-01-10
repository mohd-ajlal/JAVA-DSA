public class linkedlist_ex { 
    static class Node{ 
//        int data;
//        Node next, pre; 

        String data;
        Node next;
        Node(String data){
            this.data = data;
//            System.out.println(this.data);
        }
    }

    public static void main(String[] args) {
        Node head = new Node("A");
        head.next = new Node("B");
        head.next.next = new Node("C");
    }
} 