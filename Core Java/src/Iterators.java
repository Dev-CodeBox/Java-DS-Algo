import java.util.Scanner;

public class Iterators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Num : ");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int j = 0;
        while (j <= num) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println();

        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= num);
    }
}
