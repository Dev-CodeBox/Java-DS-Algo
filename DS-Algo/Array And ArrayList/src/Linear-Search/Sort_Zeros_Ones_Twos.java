public class Sort_Zeros_Ones_Twos {
    public static void main(String[] args) {
        // Static Array
        int[] arr = new int[5];

        // Inserting Zero And One
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 2;
        arr[4] = 1;

        // Printing Elements Of arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sortZerosOnesTwos(arr);

        // Printing Sorted Array
        System.out.print("Sorted Array -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Sort Zeros Ones Twos
    public static void sortZerosOnesTwos(int arr[]) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while (j <= k) {
            if (arr[j] == 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            } else if (arr[j] == 1) {
                j++;
            } else if (arr[j] == 2) {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }
}
