public class Queue {
    Integer[] items;
    int front;
    int rear;
    Queue(int size){
        items = new Integer[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return front == 0 && rear == items.length-1;
    }

    public boolean enQueue(Integer data){
        if(isFull()){
            front = 0;
            rear = 0;
            items[rear] = data;
            return true;
        }

        items[++rear] = data;
        return true;
    }

    public Integer[] shiftLeft(Integer[] inputArr){
        if(inputArr == null)
            return null;

        for(int i = 1; i<= rear; i++){
            inputArr[i-1] = inputArr[i];
        }
        return inputArr;
    }

    public Integer deQueue(){
        if(isEmpty())
            return null;

        if(front == rear){
            Integer val = items[rear];
            rear = -1;
            front  =-1;
            return val;
        }

        Integer val = items[front];
        items  =shiftLeft(items);
        rear--;
        return null;
    }

    public static void main(String[] args) {

    }
}
