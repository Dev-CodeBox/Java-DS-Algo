import java.util.Scanner;

public class Printing_Pairs {
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
        printingPairs(arr);
    }

    // Printing Pairs
    public static void printingPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    System.out.print(arr[i]);
                    System.out.print(arr[j] + " ");
                } else {
                    continue;
                }
            }
            System.out.println();
        }
    }
}