public class Stack {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    static class stack{
        public static Node head;
        void push(int data){
            Node temp = new Node(data);
            if (head != null) {
                temp.next = head;
            }
            head = temp;
        }

        int pop(){
            Node temp = head;
            if(head == null){
                return -1;
            }else{
                head = head.next;
            }
            return temp.data;
        }
        void display(){
            Node temp = head;
            if(head == null){
                return;
            }else{
                while(temp!=null){
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
        }
        int peek(){
            if(head==null){
                return -1;
            }else {
                return head.data;
            }
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(51);
        s.display();
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
    }
}
