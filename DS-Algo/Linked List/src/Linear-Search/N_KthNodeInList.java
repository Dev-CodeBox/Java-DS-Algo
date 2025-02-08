import java.util.Scanner;

public class N_KthNodeInList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    N_KthNodeInList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N_KthNodeInList list = new N_KthNodeInList();
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.printList();
        System.out.println("N_KthNodeInList -> " + list.n_KthNodeInList(3));
    }

    public int n_KthNodeInList(int k) {
        if (head == null || k <= 0)
            return -1;

        int length = length();
        if (k > length)
            return -1;

        int n_kthPos = length % 2 == 0 ? length / k : length / k + 1;
        /* OR */
        // int n_kthPos = Math.ceilDiv(length, k);

        Node temp = head;
        for (int i = 1; i <= n_kthPos; i++) {
            if (i == n_kthPos) {
                return temp.data;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int length() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void insertAtHead(int data) {
        if (head == null && tail == null) {
            Node node = new Node(data);
            head = node;
            tail = node;
        } else {
            Node node = new Node(data);
            node.next = head;
            head = node;
        }
    }

    public void insertAtTail(int data) {
        if (head == null && tail == null) {
            Node node = new Node(data);
            head = node;
            tail = node;
        } else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
