import java.util.Scanner;

public class Count_Zeros_Ones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Static Array
        int[] arr = new int[5];

        // Inserting Zero And One
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 1;
        arr[4] = 0;

        // Printing Elements Of arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        countZerosOnes(arr);
    }

    // Count Zeros And Ones
    public static void countZerosOnes(int[] arr) {
        int zero = 0;
        int one = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            }
        }
        System.out.println("Zeros -> " + zero + " &" + " Ones -> " + one);
    }

}