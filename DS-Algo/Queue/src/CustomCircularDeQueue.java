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
        CustomCircularDeQueue deq = new CustomCircularDeQueue(10);
        deq.pushFront(1);
        deq.pushFront(2);
        deq.pushFront(3);
        deq.pushFront(4);
        deq.pushFront(5);
        deq.pushBack(1);
        deq.pushBack(2);
        deq.pushBack(3);
        deq.pushBack(4);
        deq.pushBack(5);
        deq.printDeque();
        deq.popFront();
        deq.popFront();
        deq.popFront();
        deq.popFront();
        deq.popFront();
        deq.printDeque();
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

    public static void pushBack(int data) {
        if ((front == 0 && rear == arr.length - 1) || (rear == front - 1)) {
            System.out.println("Dequeue Is Full");
        } else if (front == -1 && rear == -1) {
            front++;
            arr[++rear] = data;
        } else if (rear == arr.length - 1) {
            rear = 0;
            arr[rear] = data;
        } else {
            arr[++rear] = data;
        }
    }

    public static int popFront() {
        int poped = -1;
        if (front == -1 && rear == -1) {
            System.out.println("Deque Is Empty");
            poped = -1;
            return poped;
        } else if (front == rear) {
            poped = arr[front];
            arr[front] = -1;
            front = rear = -1;
        } else if (front == arr.length - 1) {
            poped = arr[front];
            arr[front] = -1;
            front = 0;
        } else {
            poped = arr[front];
            arr[front] = -1;
            front++;
        }
        return poped;
    }

    public static void printDeque() {
        int index = 0;
        while (index < arr.length) {
            System.out.print(arr[index++] + " ");
        }
        System.out.println();
    }
}