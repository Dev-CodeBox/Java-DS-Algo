import java.util.Scanner;
import java.util.TreeSet;

public class UnionTwoLists {
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

    UnionTwoLists() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnionTwoLists list1 = new UnionTwoLists();
        UnionTwoLists list2 = new UnionTwoLists();
        list1.insertAtHead(scanner.nextInt());
        list1.insertAtHead(scanner.nextInt());
        list1.insertAtHead(scanner.nextInt());
        list1.printList();
        list2.insertAtHead(scanner.nextInt());
        list2.insertAtHead(scanner.nextInt());
        list2.insertAtHead(scanner.nextInt());
        list2.printList();
        list1.unionTwoLists(list1, list2);
        list1.printList();
    }

    public void unionTwoLists(UnionTwoLists list1, UnionTwoLists list2) {
        TreeSet<Integer> set = new TreeSet<>();
        Node temp1 = list1.head, temp2 = list2.head;
        while (temp1 != null) {
            set.add(temp1.data);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            set.add(temp2.data);
            temp2 = temp2.next;
        }
        head = setToList(set);
    }

    public Node setToList(TreeSet<Integer> set) {
        Node head = null, tail = null;
        for (int num : set) {
            Node node = new Node(num);
            if (head == null && tail == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
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