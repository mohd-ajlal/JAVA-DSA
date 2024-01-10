public class linkedlist_ex1 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }}

    static class LinkedList{
        private Node head;

        public void addLast(int data){
            if(head==null)  head = new Node(data);
            else{
                Node temp = head;
                while(temp.next!=null)	temp = temp.next;
                temp.next = new Node(data);
            }
        }
    public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        System.out.println();
    }
//    public int size(){
//            int len = 0;
//            Node temp = head;
//            while(temp != null){
//                ++len;
//            }
//            return len;
//    }
//    public Node midNode(){
//            int len = size();
//            Node temp = head;
//            for(int i = 0; i< (len/2); i++){
//                temp = temp.next;
//            }
//            return temp;
//    }
        public Node midNode(){
            Node fast = head;
            Node slow = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;

            }
            return slow;
        }


//        public int[] toArray(){
//            int n = size(), i=0;
//            int[] arr = new int[n];
//
//            Node temp = head;
//            while(temp!=null){
//                arr[i] = temp.data;
//                temp = temp.next;
//                ++i;
//            }
//            return arr;
//        }

        public void reverse(){
            Node pre = null;
            Node cur = head;
            Node next;

            while(cur!= null){
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }

            head = pre;
        }
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
//        LinkedList ls2 = new LinkedList();
        ls.addLast(10);
        ls.addLast(20);
        ls.addLast(30);
        ls.addLast(40);
        ls.addLast(50);
        ls.display();
        System.out.println(ls.midNode().data);

        ls.reverse();
        ls.display();
    }
}
