import java.util.Scanner;

public class Diagnol_Wise_Sum_2d {
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
        System.out.println(diagnolWiseSum2d(arr));
    }

    // Diagnol Wise Sum 2d
    public static int diagnolWiseSum2d(int[][] arr) {
        int diagnolSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    diagnolSum = diagnolSum + arr[i][j];
                }
            }
        }
        System.out.print("Diagnol Sum -> ");
        return diagnolSum;
    }
}
