import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter The String -> ");
        str = scanner.nextLine();
        String reversedString = reverseWords(str);
        System.out.println("Reversed String -> " + reversedString);
    }

    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return String.join(" ", arr);
    }
}
