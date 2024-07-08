public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail= temp;
        }

        void insertAtFirst(int val){
            Node temp = new Node(val);
            if(head==null){
                tail = temp;
            }else{
                temp.next = head;
            }
            head = temp;
        }

        void insertAt(int val, int index){
            Node t = new Node(val);
            Node temp = head;
            if(index==size()){
                insertAtEnd(val);
                return;
            }
            if(index==0){
                insertAtFirst(val);
                return;
            } else if (index<0 || index>size()) {
                System.out.println("Wrong Index");
                return;
            }
            for(int i = 1; i<=index-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        int getAt(int index){
            Node temp = head;
            for(int i = 1; i<=index; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void display(){
            Node temp =head;
            while(temp!= null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(45);
        ll.display();
        System.out.println(ll.size());
        System.out.println("First");
        ll.insertAtFirst(50);
        ll.display();
        System.out.println("insert At Mid: ");
        ll.insertAt(100, 2);
        ll.display();

        System.out.println(ll.getAt(2));
        ll.display();

    }
}
