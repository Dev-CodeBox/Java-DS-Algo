import java.util.Scanner;

public class Three_Sum {
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
        threeSum(arr);
    }

    // Three Sum
    public static void threeSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.print(arr[i] + arr[j] + arr[k] + " ");
                    } else {
                        continue;
                    }
                }
                System.out.println();
            }
        }
    }
}
