import java.util.Scanner;

public class Find_Last_Occurs {
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
        System.out.println(findLastOccurs(arr, 3));
    }
    
    // Find Last Occurs
    public static int findLastOccurs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int ansIndex = -1;
        while (start <= end) {
            if (arr[mid] == target) {
                ansIndex = mid;
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return ansIndex;
    }
}
