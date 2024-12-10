import java.util.Scanner;

public class Find_Max_2d {
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
        System.out.println("Max -> " + findmax2d(arr));
    }

    // Find Max 2d
    public static int findmax2d(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
