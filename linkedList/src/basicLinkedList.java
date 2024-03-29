public class basicLinkedList {
    static class Node{
    int data; // value
    Node next; // address of next node
    Node(int data){
        this.data = data;
    }
}

    public static void display(Node head){
        Node temp =head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayR(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " ");
        displayR(head.next);
    }

    public static int length(Node head){
        int count = 0;
        Node temp = head;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static int lengthR(Node head) {
        if (head == null)
            return 0;
        return 1 + lengthR(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        System.out.println(a.next); // null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(7);
        Node e = new Node(1);

//        5 3 5 7 1
        a.next = b;  //5 -> 3 5 7 1
        System.out.println(a.next); // basicLinkedList$Node@7b23ec81
        System.out.println(b); // basicLinkedList$Node@7b23ec81
        System.out.println(a.data); //5
        System.out.println(b.data); //3
        System.out.println(a.next.data); //3
        b.next = c; //5 -> 3 -> 5 7 1
        c.next = d; //5 -> 3 -> 5 -> 7 1
        d.next = e; //5 -> 3 -> 5 -> 7 -> 1

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);
        System.out.println();
        Node temp = a;
//        for(int i =1; i<=5; i++){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();

        System.out.println("Using function");
        display(a);
        System.out.println("Using recursive function");
        displayR(a);
        System.out.println();
        System.out.println(lengthR(a));
        System.out.println(length(a));
    }
}