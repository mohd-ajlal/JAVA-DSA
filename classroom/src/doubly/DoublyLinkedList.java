package doubly;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(5);
        dll.insertFirst(4);
        dll.insertFirst(9);
        dll.insertEnd(11);
        dll.display();
        dll.deleteLast();
//        System.out.println();
        dll.display();
        dll.deleteFirst();
//        System.out.println();
        dll.display();
    }


    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    public void insertEnd(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;

            tail = node;
        }
    }

    public void deleteLast() {
//        Node p = tail.prev;
//        p.next = null;
//
//        tail.prev = null;
//
//        tail = p;

        if(head == null) return;
        if(head == tail){
            head = tail = null;
            return;
        }
        Node p = tail.prev;
        p.next = null;

        tail.prev = null;

        tail = p;
        return;
    }

    public void deleteFirst() {
        if(head == null) return;
        if(head == tail){
            head = tail = null;
            return;
        }
        Node p = head.next;
        p.prev = null;
        head.next = null;
        head = p;
    }

    public static Node deleteMid(Node head){
        if(head == null) return null;
        if(head.next == null){
            head  = null;
            return null;
        }

        Node fast = head;
        Node slow = head;
        Node pre = null;
        while(fast!=null && fast.next!= null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

//        Node p = slow.prev;
        pre.next = pre.next.next; // for singly upto this
        
        slow.prev = null;
        slow.next = null;

        return null;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;

            head = node;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}