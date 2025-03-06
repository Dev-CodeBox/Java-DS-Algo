public class CustomCircularQueue {
    static int[] arr;
    static int size;
    static int front, rear;

    CustomCircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.front = -1;
        this.rear = -1;
    }

    public static void main(String[] args) {
        CustomCircularQueue q = new CustomCircularQueue(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
    }

    public static void push(int val) {
        if (front == -1 && rear == -1) {
            front++;
            arr[++rear] = val;
        } else if (rear == arr.length - 1 && front != 0) {
            rear = 0;
            arr[rear] = val;
        } else if ((front == 0 && rear == arr.length - 1) || (front - rear == 1)) {
            System.out.println("Queue Is Full");
            return;
        } else {
            arr[++rear] = val;
        }
    }
}