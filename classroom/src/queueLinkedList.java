public class queueLinkedList {
    Integer[] items;
    int front;
    int rear;
    queueLinkedList(int size){
        items = new Integer[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return front == -1;
    }
    public void enQueue(Integer data){
        Node newNode = new Node(data);
                
    }

}
