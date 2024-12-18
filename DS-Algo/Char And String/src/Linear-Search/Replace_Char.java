import java.util.Scanner;

public class Replace_Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size -> ");
        int size = scanner.nextInt();

        char[] chArr = new char[size];

        for (int i = 0; i < chArr.length; i++) {
            if (i % 2 == 0) {
                chArr[i] = ' ';
            } else {
                System.out.print("Enter The Char For " + i + " th Index ");
                chArr[i] = scanner.next().charAt(0);
            }
        }

        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + " ");
        }

        System.out.println();
        replaceChar(chArr);

        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + " ");
        }
    }

    // Replace Char
    public static void replaceChar(char[] chArr) {
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == ' ') {
                chArr[i] = '@';
            }
        }
    }
}
