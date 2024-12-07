import java.util.Scanner;

public class Find_Unique_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Static Array
        int[] arr = new int[5];

        // Inserting Elements Into arr
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 10;
        arr[3] = 20;
        arr[4] = 30;

        // Printing Elements Of arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println(findUniqueNumber(arr));
    }

    // Find Unique Number
    public static int findUniqueNumber(int[] arr) {
        int uniqueNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            uniqueNumber = uniqueNumber ^ arr[i];
        }
        return uniqueNumber;
    }
}
