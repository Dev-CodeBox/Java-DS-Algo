import java.util.Scanner;

public class Row_Wise_Sum_2d {
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
        rowWiseSum2d(arr);
    }

    // Row Wise Sum 2d
    public static void rowWiseSum2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr.length; j++) {
                rowSum = rowSum + arr[i][j];
            }
            System.out.print("Row Sum -> " + rowSum);
            System.out.println();
        }
    }
}