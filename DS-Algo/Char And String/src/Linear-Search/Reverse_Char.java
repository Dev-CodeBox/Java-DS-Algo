import java.util.Scanner;

public class Reverse_Char {
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
        reverseChar(chArr);

        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + " ");
        }
    }

    // Reverse Char
    public static void reverseChar(char[] chArr) {
        int i = 0;
        int j = chArr.length - 1;
        while (i < j) {
            char temp = chArr[i];
            chArr[i] = chArr[j];
            chArr[j] = temp;
            i++;
            j--;
        }
    }
}