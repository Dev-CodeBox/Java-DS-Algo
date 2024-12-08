import java.util.Scanner;

public class Sort_Zeros_Ones {
    public static void main(String[] args) {
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
        sortZerosOnes(arr);

        // Printing Sorted Array
        System.out.print("Sorted Array -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Sort Zeros Ones
    public static void sortZerosOnes(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0 && i < j) {
                i++;
            } else if (arr[i] == 1 && i < j) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}