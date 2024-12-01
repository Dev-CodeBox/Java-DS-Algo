import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Value For num_1 : ");
        int num_1 = scanner.nextInt();

        System.out.print("Enter Value For num_2 : ");
        int num_2 = scanner.nextInt();

        int sumOfNums = num_1 + num_2;
        System.out.println("num_1 = " + num_1 + " num_2 = " + num_2);

        System.out.println("sumOfNums = " + sumOfNums);
    }
}
