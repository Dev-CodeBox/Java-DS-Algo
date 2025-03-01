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
    }
}