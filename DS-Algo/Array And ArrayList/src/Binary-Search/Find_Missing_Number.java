import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Find_Missing_Number {
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
        System.out.println(findMissingNumber(arr));
    }

    // Find Missing Number
    public static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int missingNum = -1;
        while (start <= end) {
            if (arr[mid] > mid) {
                missingNum = mid;
                end = mid - 1;
            } else if (arr[mid] == mid) {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return missingNum;
    }

}
