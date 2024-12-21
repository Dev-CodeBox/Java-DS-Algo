import java.util.Scanner;

public class First_Non_Repeating_Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string -> ");
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();
        char result = findFirstNonRepeating(charArray);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("All characters in the string repeat.");
        }
    }

    public static char findFirstNonRepeating(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            boolean isRepeating = false;
            for (int j = 0; j < charArray.length; j++) {
                if (i != j && charArray[i] == charArray[j]) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return charArray[i];
            }
        }
        return '\0'; 
    }
}
