import java.util.Scanner;
import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter The Value For " + i + " th Element -> ");
            st.push(scanner.nextInt());
        }
        insertAtBottom(st, 5);
        while (!(st.isEmpty())) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
        System.out.println();
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