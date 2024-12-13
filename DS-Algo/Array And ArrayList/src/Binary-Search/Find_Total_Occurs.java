import java.util.Scanner;

public class Find_Total_Occurs {
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
        System.out.println(findTotalOccurs(arr, 2));
    }

    // Find First Occurs
    public static int findFirstOccurs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + end / 2;
        int firstOccurs = -1;
        while (start <= end) {
            if (arr[mid] == target) {
                firstOccurs = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return firstOccurs;
    }

    // Find Last Occurs
    public static int findLastOccurs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + end / 2;
        int lastOccurs = -1;
        while (start <= end) {
            if (arr[mid] == target) {
                lastOccurs = mid;
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return lastOccurs;
    }

    // Find Total Occurs
    public static int findTotalOccurs(int[] arr, int target) {
        int firstOccurance = findFirstOccurs(arr, target);
        int lastOccurance = findLastOccurs(arr, target);
        int totalOccurance = -1;
        if (firstOccurance > 0 || lastOccurance > 0) {
            totalOccurance = (lastOccurance - firstOccurance) + 1;
        }
        return totalOccurance;
    }
}