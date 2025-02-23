import java.util.Scanner;
import java.util.Stack;

public class MinInStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter The Value -> ");
            st.push(scanner.nextInt());
        }
        int minInStack = getMin(st, Integer.MAX_VALUE);
        System.out.println("Min In Stack -> " + minInStack);
    }

    public static int getMin(Stack<Integer> st, int min) {
        if (st.isEmpty()) {
            return min;
        }
        int top = st.pop();
        if (top < min) {
            min = top;
        }
        return getMin(st, min);
    }
}