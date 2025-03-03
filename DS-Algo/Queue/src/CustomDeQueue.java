public class CustomDeQueue {
    static int[] arr;
    static int size;
    static int front, rear;

    CustomDeQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.front = -1;
        this.rear = -1;
    }

    public static void main(String[] args) {
        CustomDeQueue deq = new CustomDeQueue(5);
        deq.pushFront(10);
        deq.pushFront(20);
        deq.pushFront(30);
        deq.print();
        deq.pushBack(20);
        deq.pushBack(30);
        deq.pushBack(40);
        deq.pushBack(50);
        deq.pushBack(60);
        deq.print();
        System.out.println("Poped Element -> " + deq.popFront());
        deq.print();
    }

    public static void pushFront(int data) {
        if (front == -1 && rear == -1) {
            front++;
            arr[++rear] = data;
        } else if (front == 0) {
            System.out.println("Front At 0");
        } else {
            arr[--front] = data;
        }
    }

    public static int popFront() {
        int poped = -1;
        if (front == -1 && rear == -1) {
            System.out.println("Queue Is Empty");
            return -1;
        } else if (front == rear) {
            poped = arr[front];
            arr[front] = -1;
            front = -1;
            rear = -1;
            return poped;
        } else {
            poped = arr[front];
            arr[front++] = -1;
            return poped;
        }
    }

    public static void pushBack(int data) {
        if (front == -1 && rear == -1) {
            front++;
            arr[++rear] = data;
        } else if (rear == arr.length - 1) {
            System.out.println("Rear At Last");
        } else {
            arr[++rear] = data;
        }
    }

    public static void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}