import java.util.Scanner;

public class ReverseLinkedList {
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

    ReverseLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReverseLinkedList list = new ReverseLinkedList();
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.printList();
        list.reverseLinkedList();
        list.printList();
    }

    public void reverseLinkedList() {
        int length = length();
        int[] arr = new int[length];
        int arrIndex = 0;
        Node temp = head;
        while (temp != null) {
            arr[arrIndex] = temp.data;
            arrIndex++;
            temp = temp.next;
        }
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int element = arr[i];
            arr[i] = arr[j];
            arr[j] = element;
            i++;
            j--;
        }
        int index = 0;
        Node curr = head;
        while (curr != null) {
            curr.data = arr[index];
            curr = curr.next;
            index++;
        }
    }

    public int length() {
        int nodeCount = 0;
        Node temp = head;
        while (temp != null) {
            nodeCount++;
            temp = temp.next;
        }
        return nodeCount;
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
