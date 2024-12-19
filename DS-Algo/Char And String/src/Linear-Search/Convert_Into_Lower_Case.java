import java.util.Scanner;

public class Convert_Into_Lower_Case {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size -> ");
        int size = scanner.nextInt();

        char[] chArr = new char[size];

        for (int i = 0; i < chArr.length; i++) {
            System.out.print("Enter The Char For " + i + " th Index ");
            chArr[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + " ");
        }

        System.out.println();
        convertIntoLowerCase(chArr);

        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + " ");
        }
    }

    // Convert Into Lower Case
    public static void convertIntoLowerCase(char[] chArr) {
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] >= 65 && chArr[i] < 97) {
                chArr[i] = (char) (chArr[i] - 'A' + 'a');
            }
        }
    }
}