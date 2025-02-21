import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter The Value For " + i + " th Element -> ");
            st.push(scanner.nextInt());
        }
        for (int i = 0; i < st.size(); i++) {
            System.out.print(st.get(i) + " ");
        }
        System.out.println();
        reverse(st);
        for (int i = 0; i < st.size(); i++) {
            System.out.print(st.get(i) + " ");
        }
        System.out.println();
    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverse(st);
        insertAtBottom(st, top);
    }

    public static void insertAtBottom(Stack<Integer> st, int value) {
        if (st.isEmpty()) {
            st.push(value);
            return;
        }
        int top = st.peek();
        st.pop();
        insertAtBottom(st, value);
        st.push(top);
    }
}