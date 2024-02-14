//public class CircularQueue {
//}

// CircularQueue.java
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularQueue {
    private Node front, rear;

    public CircularQueue() {
        front = rear = null;
    }

    // Method to add an element to the circular queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        rear.next = front;
    }

    // Method to remove an element from the circular queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int deletedItem = front.data;
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
                rear.next = front;
            }
            return deletedItem;
        }
    }

    // Method to check if the circular queue is empty
    public boolean isEmpty() {
        return front == null && rear == null;
    }

    // Method to display the circular queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node temp = front;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != front);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Elements in the circular queue:");
        queue.display();

        System.out.println("Dequeue operation:");
        System.out.println(queue.dequeue() + " dequeued from the queue");
        System.out.println(queue.dequeue() + " dequeued from the queue");

        System.out.println("Elements in the circular queue after dequeue:");
        queue.display();
    }
}
