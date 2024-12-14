import java.util.Scanner;

public class Search_Space_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Static Array
        int[] arr = new int[5];

        // Inserting Elements Into arr ( Must be Sorted )
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter The Element For " + i + "th Index");
            arr[i] = scanner.nextInt();
        }

        // Printing Elements Of arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println(searchSpacePattern(arr, 15));
    }

    // Search Space Pattern - SQRT
    public static int searchSpacePattern(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int sqrt = 0;
        while (start <= end) {
            if (arr[mid] * arr[mid] == num) {
                return arr[mid];
            } else if (arr[mid] * arr[mid] < num) {
                sqrt = arr[mid];
                start = mid + 1;
            } else if (arr[mid] * arr[mid] > num) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return sqrt;
    }

}
