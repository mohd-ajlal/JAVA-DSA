package circular;

public class circularLinkedList {
     class  Node {
         int data;
         Node next;

         public Node(int data) {
             this.data = data;
         }
     }


            Node head;
            public void insertFirst(int data){
                Node newNode = new Node(data);
                if(head == null){
                    head = newNode;
                    newNode.next = head;
                    return;
                }

                Node temp = head;
                while (temp.next != head){
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = head;
                head = newNode;
            }

            public void addLast(int data){
                Node newNode = new Node(data);
                if(head == null){
                    head = newNode;
                    newNode.next = head;
                    return;
                }

                Node temp = head;
                while (temp.next != head){
                    temp = temp.next;
                }
                temp.next  = newNode;
                newNode.next = head;
            }

            public void display(){
                Node current = head;
                if(head == null) {
                    System.out.println("List is empty");
                }
                else {
                    System.out.println("Nodes of the circular linked list: ");
                    do{
                        //Prints each node by incrementing pointer.
                        System.out.print(" "+ current.data);
                        current = current.next;
                    }while(current != head);
                    System.out.println();
                }
            }
    public static void main(String[] args) {
        circularLinkedList cl = new circularLinkedList();
        cl.insertFirst(10);
        cl.addLast(20);
        cl.addLast(30);
        cl.display();
    }



    }


