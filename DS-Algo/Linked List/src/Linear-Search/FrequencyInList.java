import java.util.Scanner;

public class FrequencyInList {
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

    FrequencyInList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FrequencyInList list = new FrequencyInList();
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.insertAtHead(scanner.nextInt());
        list.printList();
        System.out.println("Freq Of Key -> " + list.frequencyInList(5));
    }

    public int frequencyInList(int key) {
        int keyFreq = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                keyFreq++;
            }
            temp = temp.next;
        }
        return keyFreq;
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