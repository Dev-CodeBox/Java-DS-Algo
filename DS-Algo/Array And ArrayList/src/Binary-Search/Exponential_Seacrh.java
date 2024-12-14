import java.util.Scanner;

public class Exponential_Seacrh {

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
        System.out.println("Target Found At -> " + expSearch(arr, arr.length, 5) + "th Index");
    }

    // Exponential Search Function
    public static int expSearch(int[] a, int n, int x) {
        if (a[0] == x)
            return 0;
        int i = 1;
        while (i < n && a[i] <= x) {
            i = i * 2;
        }
        return binarySearch(a, i / 2, Math.min(i, n - 1), x);
    }

    // Binary Search Function
    public static int binarySearch(int[] a, int start, int end, int x) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}