package Sorting;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Sort_0_1_2 {
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

    Sort_0_1_2() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sort_0_1_2 list = new Sort_0_1_2();
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.printList();
        list.sort_0_1_2();
        list.printList();
    }

    public void sort_0_1_2() {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(list);
        int index = 0;
        Node curr = head;
        while (curr != null) {
            curr.data = list.get(index++);
            curr = curr.next;
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
