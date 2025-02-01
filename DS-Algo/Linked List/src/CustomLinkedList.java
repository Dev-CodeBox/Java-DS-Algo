import java.util.Scanner;

public class CustomLinkedList {
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

    CustomLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomLinkedList list = new CustomLinkedList();
        list.insertAtHead(scanner.nextInt());
        list.insertAtTail(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtTail(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtTail(scanner.nextInt());
        list.printList();
        list.sizeOfList();
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

    public void sizeOfList() {
        Node temp = head;
        int sizeCount = 0;
        while (temp != null) {
            sizeCount++;
            temp = temp.next;
        }
        System.out.println("Size -> " + sizeCount);
    }
}