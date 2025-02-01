public class CustomLinkedList {
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

    CustomLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
    }
}