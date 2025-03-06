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
        q.printQueue();
        q.pop();
        q.pop();
        q.pop();
        q.push(6);
        q.push(7);
        q.push(8);
        q.printQueue();
        q.pop();
        q.pop();
        q.pop();
        q.printQueue();
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

    public static int pop() {
        int poped = -1;
        if (front == -1 && rear == -1) {
            poped = -1;
            System.out.println("Queue Is Empty");
            return poped;
        } else if (front == rear) {
            poped = arr[front];
            arr[front] = -1;
            front = -1;
            rear = -1;
            return poped;
        } else if (front == arr.length - 1) {
            poped = arr[front];
            arr[front] = -1;
            front = 0;
            return poped;
        } else {
            poped = arr[front];
            arr[front++] = -1;
            return poped;
        }
    }

    public static void printQueue() {
        System.out.print("Queue -> ");
        int index = 0;
        while (index < arr.length) {
            System.out.print(arr[index++] + " ");
        }
        System.out.println();
    }
}