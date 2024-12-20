import java.util.Scanner;

public class Check_Palindrome {
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
        System.out.println(checkPalindrome(chArr));
    }

    // Check Palindrome
    public static boolean checkPalindrome(char[] chArr) {
        int i = 0;
        int j = chArr.length - 1;
        while (i < j) {
            if (chArr[i] == chArr[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
