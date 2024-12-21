import java.util.Scanner;

public class Remove_Adjacent {
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
        removeAdjacent(chArr, size);
    }

    // Remove Adjacent
    public static void removeAdjacent(char[] chArr, int size) {
        char[] chArr2 = new char[size];
        chArr2[0] = chArr[0];
        int j = 1;
        for (int i = 1; i < size; i++) {
            if (chArr[i] != chArr2[j - 1]) {
                chArr2[j] = chArr[i];
                j++;
            }
        }
        for (int i = 0; i < chArr2.length; i++) {
            System.out.print(chArr2[i] + " ");
        }
    }
}