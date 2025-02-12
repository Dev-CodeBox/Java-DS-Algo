import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergeTwoSortedList {
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

    MergeTwoSortedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MergeTwoSortedList list1 = new MergeTwoSortedList();
        MergeTwoSortedList list2 = new MergeTwoSortedList();
        list1.insertAtHead(scanner.nextInt());
        list1.insertAtHead(scanner.nextInt());
        list1.insertAtHead(scanner.nextInt());
        list2.insertAtHead(scanner.nextInt());
        list2.insertAtHead(scanner.nextInt());
        list2.insertAtHead(scanner.nextInt());
        list1.printList();
        list2.printList();
        list1.mergeTwoSortedList(list1, list2);
        list1.printList();
    }

    public Node mergeTwoSortedList(MergeTwoSortedList list1, MergeTwoSortedList list2) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp1 = list1.head, temp2 = list2.head;
        Node join = list1.head;
        while (temp1 != null) {
            arr.add(temp1.data);
            temp1 = temp1.next;
            if (join.next != null) {
                join = join.next;
            }
        }
        while (temp2 != null) {
            arr.add(temp2.data);
            temp2 = temp2.next;
        }
        join.next = list2.head;
        Collections.sort(arr);
        int index = 0;
        Node curr = list1.head;
        while (curr != null) {
            curr.data = arr.get(index++);
            curr = curr.next;
        }
        return list1.head;
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
