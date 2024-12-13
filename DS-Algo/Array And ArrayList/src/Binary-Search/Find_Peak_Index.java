import java.util.Arrays;
import java.util.Scanner;

public class Find_Peak_Index {
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
        System.out.println(findPeakIndex(arr));
    }

    // Find Peak Index
    public static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int peak = - 1;
        while (start <= end) {
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                peak = mid;
                return peak;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return peak;
    }
}
