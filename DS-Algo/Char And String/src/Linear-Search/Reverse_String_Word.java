import java.util.Scanner;

public class Reverse_String_Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st string -> ");
        String str1st = new String();
        str1st = scanner.nextLine();
        System.out.println("First String -> " + str1st);

        System.out.println("Reversed Strin -> " + reverseStringWord(str1st));
    }

    // Reverse String Word
    public static String reverseStringWord(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}