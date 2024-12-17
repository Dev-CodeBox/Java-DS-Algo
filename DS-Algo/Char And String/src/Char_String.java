import java.util.Scanner;

public class Char_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = 'D';
        // Printing a single character
        System.out.println("Printing Single Char -> " + ch);

        char[] chArr = new char[3];
        // Taking 3 characters as input from user and storing them in character array
        for (int i = 0; i < chArr.length; i++) {
            System.out.print("Enter Character " + (i + 1) + ": ");
            chArr[i] = scanner.next().charAt(0);
        }

        // Printing all the characters from the character array
        System.out.print("Printing All Char -> ");
        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + " ");
        }
        System.out.println();

        // Working with a string and printing its properties
        String name = "Dev";
        System.out.println("Printing name -> " + name);
        // Prints each character of the string
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
        // Prints the first character of the string
        System.out.println("Char At 0th Index -> " + name.charAt(0));
        // Prints the length of the string
        System.out.println("Printing Length -> " + name.length());

        // Creating a string using the 'new' keyword and displaying its details
        String hobbies = new String("Gaming, Coding");
        System.out.println("Printing hobbies -> " + hobbies);
        // Prints each character of the string
        for (int i = 0; i < hobbies.length(); i++) {
            System.out.print(hobbies.charAt(i) + " ");
        }
        System.out.println();
        // Prints the character at the 8th index
        System.out.println("Char At 0th Index -> " + hobbies.charAt(8));
        // Prints the length of the string
        System.out.println("Printing Length -> " + hobbies.length());
    }
}
