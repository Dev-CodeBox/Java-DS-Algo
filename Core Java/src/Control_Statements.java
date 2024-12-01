import java.util.Scanner;

public class Control_Statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Num : ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Positive Number");
        }

        System.out.print("Enter Your Age : ");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("Eligible To Vote");
        } else {
            System.out.println("Note Eligible To Vote");
        }

        System.out.print("Enter Your Score : ");
        int score = scanner.nextInt();
        if (score < 50) {
            System.out.print("Need Improvement");
        } else if (score > 50 && score < 75) {
            System.out.println("Your Score Is Good : " + score + " %");
        } else {
            System.out.println("Your Score Is Awesome : " + score + " %");
        }
    }
}