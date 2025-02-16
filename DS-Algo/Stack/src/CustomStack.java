import java.util.Scanner;

public class CustomStack {
    int[] arr;
    int size;
    int top;

    CustomStack(int size) {
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size for Stack -> ");
        CustomStack stack = new CustomStack(scanner.nextInt());
        System.out.print("Enter value for Stack -> ");
        stack.insert(scanner.nextInt());
        stack.insert(scanner.nextInt());
        stack.insert(scanner.nextInt());
    }

    public void insert(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        } else {
            arr[++top] = data;
        }
    }
}