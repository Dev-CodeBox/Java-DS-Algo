import java.util.Scanner;

public class Column_Wise_Sum_2d {
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
        columnWiseSum2d(arr);
    }

    // Column Wise Sum 2d
    public static void columnWiseSum2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int colSum = 0;
            for (int j = 0; j < arr.length; j++) {
                colSum = colSum + arr[j][i];
            }
            System.out.print("Column Sum -> " + colSum);
            System.out.println();
        }
    }
}
