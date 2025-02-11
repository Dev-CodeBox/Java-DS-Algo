import java.util.Scanner;

public class CheckPalindrome {
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

    CheckPalindrome() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckPalindrome list = new CheckPalindrome();
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.printList();
        System.out.println("List Is Palindrome -> " + list.isPalindrome());
    }

    public boolean isPalindrome() {
        // Your code here
        if (head == null || head.next == null)
            return true;

        Node mid = midNode();

        Node temp = head;
        while (temp.next != mid) {
            temp = temp.next;
        }
        temp.next = null;

        Node head2nd = reverseList(mid);

        Node temp1 = head;
        Node temp2 = head2nd;
        while (temp1 != null) {
            if (temp1.data != temp2.data) {
                return false;
            } else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return true;
    }

    public Node midNode() {
        Node slow = head, fast = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    public Node reverseList(Node start) {
        Node curr = start, prev = null;
        while (curr != null) {
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
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