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

    public static void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}