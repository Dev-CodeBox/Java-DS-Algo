import java.util.Stack;

public class ReverseEquation {
    public static void main(String[] args) {
        String S = "2+2/2*2";
        S = reverseEqn(S);
        System.out.println("Reversed Equation -> " + S);
    }

    public static String reverseEqn(String S) {
        String[] str = S.split("(?<=[-+*/])|(?=[-+*/])");
        Stack<String> st = new Stack<>();
        for (String s : str) {
            st.push(s);
        }

        StringBuilder reversed = new StringBuilder();
        while (!st.isEmpty()) {
            reversed.append(st.pop());
        }
        return reversed.toString();
    }
}