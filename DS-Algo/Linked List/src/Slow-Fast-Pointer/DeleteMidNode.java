import java.util.Scanner;

public class DeleteMidNode {
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

    DeleteMidNode() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeleteMidNode list = new DeleteMidNode();
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.printList();
        list.deleteMidNode();
        list.printList();
    }

    public void deleteMidNode() {
        Node slow = head, fast = head;
        Node prev = null;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                prev = slow;
                slow = slow.next;
            }
        }
        if (prev != null) {
            prev.next = slow.next;
            slow.next = null;
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