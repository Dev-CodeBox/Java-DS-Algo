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
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtTail(scanner.nextInt());
        list.insertAtTail(scanner.nextInt());
        list.insertAtTail(scanner.nextInt());
        list.printList();
        list.insertAtMid(scanner.nextInt());
        list.printList();
        list.insertAtPos(8, scanner.nextInt());
        list.printList();
        System.out.println(list.searchTarget(5));
        list.deleteAtPos(5);
        list.printList();
        // list.sizeOfList();
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

    public void insertAtMid(int data) {
        int size = 0;
        Node sizeTemp = head;
        while (sizeTemp != null) {
            size++;
            sizeTemp = sizeTemp.next;
        }

        int insertAt = (size % 2 == 0) ? (size / 2 - 1) : (size / 2);
        if (head == null) {
            Node node = new Node(data);
            head = node;
            tail = node;
        } else {
            Node temp = head;
            for (int i = 0; i < insertAt; i++) {
                temp = temp.next;
            }
            Node node = new Node(data);
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void insertAtPos(int pos, int data) {
        if (head == null) {
            Node node = new Node(data);
        } else if (pos == 1) {
            insertAtHead(data);
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            Node node = new Node(data);
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void deleteAtPos(int pos) {
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        Node deleteNode = temp.next;
        temp.next = deleteNode.next;
        deleteNode = null;
    }

    public boolean searchTarget(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
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