import java.util.Scanner;

public class revision {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail  = null;

        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtFirst(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }

        int size(){
            Node temp = head;
            int len  = 0;
            while(temp!=null){
                len++;
                temp = temp.next;
            }
            return len;
        }

        void insertAt(int data, int index){
            Node temp = new Node(data);
            Node t = head;
            if(size() == index){
                insertAtEnd(data);
                return;
            }else if(index > size() || index < 0){
                System.out.println("wrong index");
                return;
            }else{
                for(int i = 0; i<index-1; i++){
                    t = t.next;
                }
                temp.next = t.next;
                t.next = temp;
            }
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        public Node reverse(Node head){
            if(head == null){
                return head;
            }
            Node newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int data = sc.nextInt();
            ll.insertAtEnd(data);
        }
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.insertAt(50, 2);
        ll.display();
        System.out.println();
        ll.head = ll.reverse(ll.head);
        ll.display();

    }
}
