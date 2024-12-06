import java.util.Scanner;

public class Find_Target {
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
        for (int i : arr) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        findTarget(arr, 1);
    }

    // Find Target
    public static int findTarget(int[] arr, int target) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print("Target Found At " + i + "th Index");
                ans = target;
                return ans;
            }
        }
        return ans;
    }

}