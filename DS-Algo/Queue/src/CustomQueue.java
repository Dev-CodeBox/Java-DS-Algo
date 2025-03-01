import java.util.Scanner;

public class CustomQueue {
    private static int[] arr;
    private static int front, rear, size;

    CustomQueue(int size) {
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Size For Queue -> ");
        CustomQueue queue = new CustomQueue(scanner.nextInt());
        System.out.print("Enter The Value For Queue -> ");
        queue.push(scanner.nextInt());
        queue.push(scanner.nextInt());
        queue.push(scanner.nextInt());
        queue.push(scanner.nextInt());
        queue.push(scanner.nextInt());
        queue.pop();
        queue.pop();
        System.out.println("Size -> " + queue.size());
        System.out.println("Front -> " + getFront());
        System.out.println("Rear -> " + getRear());
    }

    public static void push(int data) {
        if (front == -1 && rear == -1) {
            arr[++rear] = data;
            front++;
        } else if (rear == arr.length - 1) {
            System.out.println("Queue Overflow");
            return;
        } else {
            arr[++rear] = data;
        }
    }

    public static void pop() {
        if (front == -1 && rear == -1) {
            System.out.println("Empty Queue");
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }

    public static int size() {
        if (front == -1 && rear == -1) {
            return 0;
        }
        return ((rear - front) + 1);
    }

    public static int getFront() {
        if (front == -1 && rear == -1) {
            System.out.println("No Element Present");
        }
        return arr[front];
    }

    public static int getRear() {
        if (rear == -1 && rear == -1) {
            System.out.println("No Element Present");
        }
        return arr[rear];
    }
}