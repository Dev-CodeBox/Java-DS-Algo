public class CustomCircularDeQueue {
    static int[] arr;
    static int size;
    static int front, rear;

    CustomCircularDeQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.front = -1;
        this.rear = -1;
    }

    public static void main(String[] args) {
        CustomCircularDeQueue deq = new CustomCircularDeQueue(5);
        deq.pushFront(1);
        deq.pushFront(2);
        deq.pushFront(3);
        deq.pushFront(4);
        deq.pushFront(5);
    }

    public static void pushFront(int data) {
        if ((front == 0 && rear == arr.length - 1) || (front == rear + 1)) {
            System.out.println("Dequeue Is Full");
        } else if (front == -1 && rear == -1) {
            front++;
            arr[++rear] = data;
        } else if (front == 0) {
            front = arr.length - 1;
            arr[front] = data;
        } else {
            arr[--front] = data;
        }
    }
}