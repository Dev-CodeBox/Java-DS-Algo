import java.util.Scanner;

public class CustomDoublyLinkedList {
    class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    CustomDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomDoublyLinkedList list = new CustomDoublyLinkedList();
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtTail(scanner.nextInt());
        list.insertAtTail(scanner.nextInt());
        list.insertAtTail(scanner.nextInt());
        list.printList();
        System.out.println("Size Of List -> " + list.sizeOfList());
    }

    public void insertAtHead(int data) {
        if (head == null && tail == null) {
            Node node = new Node(data);
            head = node;
            tail = node;
        } else {
            Node node = new Node(data);
            node.next = head;
            head.prev = node;
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
            node.prev = tail;
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

    public int sizeOfList() {
        Node temp = head;
        int sizeCount = 0;
        while (temp != null) {
            sizeCount++;
            temp = temp.next;
        }
        return sizeCount;
    }
}