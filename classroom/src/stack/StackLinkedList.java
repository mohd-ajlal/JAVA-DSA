package stack;
// dynamic stack
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {
    private Node top;

    public StackLinkedList() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(data);
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int popp = top.data;
        top = top.next;
        return popp;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        stack.display();
    }
}
