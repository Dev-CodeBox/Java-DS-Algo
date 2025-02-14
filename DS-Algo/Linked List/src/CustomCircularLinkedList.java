public class CustomCircularLinkedList {
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

    CustomCircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        CustomCircularLinkedList list = new CustomCircularLinkedList();
    }
}
