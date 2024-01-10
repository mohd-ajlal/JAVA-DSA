package stack;

public class Stack {
    private final Integer[] items;
    private int top;
    public Stack(int size){
        items = new Integer[size];
        top = -1;
    }
    public boolean isEmpty(){
        return top < 0;
    }

    public boolean isFull(){
        return top == items.length - 1;
    }

    public boolean push(int data) {
        if(isFull()){
            return false;
        }

        items[++top] = data;
        return true;
    }

    public Integer pop(){
        if(isEmpty()){
            return null;
        }
        return items[top--];
    }

    public Integer peek(){
        if(isEmpty()){
            return null;
        }
        return items[top];
    }

    public static void main(String[] args) {
        Stack st = new Stack(6);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

//        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
