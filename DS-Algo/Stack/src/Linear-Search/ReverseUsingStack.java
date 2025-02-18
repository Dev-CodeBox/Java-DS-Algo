import java.util.Scanner;
import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = new String(scanner.next());
        System.out.println("Before Reversing -> " + str);
        System.out.println("After Reversing -> " + reverse(str));
    }

    public static String reverse(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!(st.isEmpty())) {
            sb.append(st.peek());
            st.pop();
        }
        return sb.toString();
    }
}