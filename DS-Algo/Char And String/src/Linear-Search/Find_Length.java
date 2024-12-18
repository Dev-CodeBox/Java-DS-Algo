import java.util.Scanner;

public class Find_Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size -> ");
        int size = scanner.nextInt();

        char[] chArr = new char[size];
        System.out.println("Length Of ChArr -> " + findLength(chArr, size));
    }

    // Find Length
    public static int findLength(char[] chArr, int n) {
        int length = 0;
        for (int i = 0; i < n; i++) {
            length++;
        }
        return length;
    }
}