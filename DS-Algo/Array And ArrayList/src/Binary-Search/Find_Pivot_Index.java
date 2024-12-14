import java.util.Scanner;

public class Find_Pivot_Index {
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
        System.err.println(findPivotIndex(arr));
    }

    // Find Pivot Index
    public static int findPivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
}