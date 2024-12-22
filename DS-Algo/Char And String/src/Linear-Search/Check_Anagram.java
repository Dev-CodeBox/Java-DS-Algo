import java.util.Arrays;
import java.util.Scanner;

public class Check_Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st string -> ");
        String str1st = new String();
        str1st = scanner.nextLine();
        System.out.print("Enter 1st string -> ");
        String str2nd = new String();
        str2nd = scanner.nextLine();
        System.out.println("First String -> " + str1st);
        System.out.println("Second String -> " + str2nd);

        System.out.println("Anagram Is -> " + checkAnagram(str1st, str2nd));
    }

    // Check Anagram
    public static boolean checkAnagram(String str1st, String str2nd) {
        if (str1st.length() != str2nd.length()) {
            return false;
        }

        str1st = SortString(str1st);
        str2nd = SortString(str2nd);

        int i = 0;
        while (i < str1st.length()) {
            if (str1st.charAt(i) != str2nd.charAt(i)) {
                return false;
            }
            i++;
        }

        return true;
    }

    // Sort String
    public static String SortString(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}