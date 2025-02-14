import java.util.Scanner;

public class Add1ToList {
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

    Add1ToList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Add1ToList list = new Add1ToList();
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.printList();
        list.add1ToList();
        list.printList();
    }

    public void add1ToList() {
        reverse();
        Node temp = head;
        int carry = 1;
        while (temp != null) {

            int sum = temp.data + carry;
            int digit = sum % 10;
            carry = sum / 10;

            temp.data = digit;
            if (temp.next == null && carry != 0) {
                Node node = new Node(carry);
                temp.next = node;
                carry = 0;
            }
            temp = temp.next;
        }
        reverse();
    }

    public void reverse() {
        Node prev = null, curr = head;
        while (curr != null) {
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            head = prev;
            curr = forward;
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
