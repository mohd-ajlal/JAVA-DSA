//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//
//class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        Node head = null;
//        Node tail = null;
//
//        for (int i = 0; i < n; i++) {
//            int value = scanner.nextInt();
//            Node newNode = new Node(value);
//            if (head == null) {
//                head = newNode;
//                tail = newNode;
//            } else {
//                tail.next = newNode;
//                tail = newNode;
//            }
//        }
//
//        printEvenNodes(head);
//    }
//
//    public static void printEvenNodes(Node head) {
//        if (head == null || head.next == null) {
//            System.out.println("null");
//            return;
//        }
//
//        Node current = head.next;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            if (current.next != null) {
//                current = current.next.next;
//            } else {
//                break;
//            }
//        }
//    }
//}
//
//
//
//
//
//
//
//
//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//
//class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        Node head = null;
//        Node tail = null;
//
//        for (int i = 0; i < n; i++) {
//            int value = scanner.nextInt();
//            Node newNode = new Node(value);
//            if (head == null) {
//                head = newNode;
//                tail = newNode;
//            } else {
//                tail.next = newNode;
//                tail = newNode;
//            }
//        }
//
//        printEvenNodes(head);
//    }
//
//    public static void printEvenNodes(Node head) {
//        if (head == null) {
//            System.out.println("null");
//            return;
//        }
//
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            if (current.next != null) {
//                current = current.next;
//            } else {
//                break;
//            }
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//
//class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        Node head = null;
//        Node tail = null;
//
//        for (int i = 0; i < n; i++) {
//            int value = scanner.nextInt();
//            Node newNode = new Node(value);
//            if (head == null) {
//                head = newNode;
//                tail = newNode;
//            } else {
//                tail.next = newNode;
//                tail = newNode;
//            }
//        }
//
//        int count = countEvenNodes(head);
//        System.out.println(count);
//    }
//
//    public static int countEvenNodes(Node head) {
//        int count = 0;
//        Node current = head;
//
//        while (current != null) {
//            if (current.data % 2 == 0) {
//                count++;
//            }
//            current = current.next;
//        }
//
//        return count;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//import java.util.Scanner;
//
//class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[] A = new int[n];
//        int[] B = new int[m];
//
//        for (int i = 0; i < n; i++) {
//            A[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < m; i++) {
//            B[i] = scanner.nextInt();
//        }
//
//        int[] C = mergeSortedArrays(A, B);
//
//        for (int i : C) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public static int[] mergeSortedArrays(int[] A, int[] B) {
//        int n = A.length;
//        int m = B.length;
//        int[] C = new int[n + m];
//        int i = 0, j = 0, k = 0;
//
//        while (i < n && j < m) {
//            if (A[i] <= B[j]) {
//                C[k++] = A[i++];
//            } else {
//                C[k++] = B[j++];
//            }
//        }
//        while (i < n) {
//            C[k++] = A[i++];
//        }
//
//        while (j < m) {
//            C[k++] = B[j++];
//        }
//
//        return C;
//    }
//}
