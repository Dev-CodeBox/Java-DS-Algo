public class CustomDoublyLinkedList {
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

    CustomDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        CustomDoublyLinkedList list = new CustomDoublyLinkedList();
    }
}