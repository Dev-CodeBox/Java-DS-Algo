import java.util.Scanner;

public class Extreme_Printing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Static Array
        int[] arr = new int[5];

        // Inserting Elements Into arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter The Element For " + i + "th Index");
            arr[i] = scanner.nextInt();
        }

        // Printing Elements Of arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        extremePrinting(arr);
    }

    // Extreme Printing
    public static void extremePrinting(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < arr.length) {
            if (i == j) {
                System.out.print(arr[i]);
            } else if (i > j) {
                break;
            } else {
                System.out.print(arr[i] + " " + arr[j] + " ");
            }
            i++;
            j--;
        }
    }
}