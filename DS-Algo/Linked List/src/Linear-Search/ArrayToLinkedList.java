import java.util.Scanner;

public class ArrayToLinkedList {
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

    ArrayToLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayToLinkedList list = new ArrayToLinkedList();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        list.arrayToLinkedList(arr);
        System.out.println("Printing Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " -> ");
        }
        System.out.println();
        System.out.println("Printing List");
        list.printList();
    }

    public void arrayToLinkedList(int[] arr) {
        Node temp = head;
        for (int i = 0; i < arr.length; i++) {
            if (head == null) {
                Node node = new Node(arr[i]);
                head = node;
                temp = node;
            } else {
                Node node = new Node(arr[i]);
                temp.next = node;
                temp = node;
            }
        }
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
