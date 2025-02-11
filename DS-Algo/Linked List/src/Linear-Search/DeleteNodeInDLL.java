import java.util.Scanner;

public class DeleteNodeInDLL {

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

    DeleteNodeInDLL() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeleteNodeInDLL list = new DeleteNodeInDLL();
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.printList();
        list.deleteNodeInDLL(3);
        list.printList();
    }

    public void deleteNodeInDLL(int pos) {
        if (pos == 1) {
            head = head.next;
            head.prev = null;
        } else {
            Node temp = head;
            for (int i = 0; i < pos - 2; i++) {
                temp = temp.next;
            }
            Node toDel = temp.next;
            temp.next = toDel.next;
            toDel.next.prev = temp;
            toDel.next = null;
            toDel.prev = null;
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