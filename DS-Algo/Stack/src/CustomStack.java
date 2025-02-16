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
    }
}