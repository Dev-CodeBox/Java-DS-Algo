import java.util.Scanner;

public class Sort_0_1_2_InList {
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

    Sort_0_1_2_InList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sort_0_1_2_InList list = new Sort_0_1_2_InList();
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.printList();
        list.sort_0_1_2_InList();
        list.printList();
    }

    public void sort_0_1_2_InList() {
        Node zeroHead = null, zeroTail = null;
        Node oneHead = null, oneTail = null;
        Node twoHead = null, twoTail = null;

        while (head != null) {

            Node toMove = head;
            head = head.next;
            toMove.next = null;

            if (toMove.data == 0) {
                Node[] updated = insertAtTail(zeroHead, zeroTail, toMove);
                zeroHead = updated[0];
                zeroTail = updated[1];
            } else if (toMove.data == 1) {
                Node[] updated = insertAtTail(oneHead, oneTail, toMove);
                oneHead = updated[0];
                oneTail = updated[1];
            } else if (toMove.data == 2) {
                Node[] updated = insertAtTail(twoHead, twoTail, toMove);
                twoHead = updated[0];
                twoTail = updated[1];
            }
        }

        if (zeroHead != null) {
            if (oneHead != null) {
                zeroTail.next = oneHead;
                oneTail.next = twoHead;
            } else {
                zeroTail.next = twoHead;
            }
            head = zeroHead;
        } else {
            if (oneHead != null) {
                oneTail.next = twoHead;
                head = oneHead;
            } else {
                head = twoHead;
            }
        }
    }

    public Node[] insertAtTail(Node head, Node tail, Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        return new Node[] { head, tail };
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}