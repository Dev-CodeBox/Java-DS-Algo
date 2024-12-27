import java.util.Scanner;

public class Split_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Value For num -> ");
        int num = scanner.nextInt();
        splitNum(num);
    }

    // Split Number
    public static void splitNum(int num) {
        if (num == 0) {
            return;
        }
        int splitedNum = num % 10;
        splitNum(num / 10);
        System.out.println(splitedNum + " ");
    }
}