import java.util.Scanner;

public class Find_Target_2d {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 2d Static Array
        int[][] arr = new int[3][3];

        // Inserting Elements Into arr
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Enter The Element For " + i + j + "th Index");
                arr[i][j] = scanner.nextInt();
            }
        }

        // Printing Elements Of arr
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        findTarget2d(arr, 1);
    }

    // Find Target 2d
    public static int findTarget2d(int[][] arr, int target) {
        int notFound = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == target) {
                    System.out.print("Target Found At " + i + j + "th Index");
                    return target;
                }
            }
        }
        return notFound;
    }
}