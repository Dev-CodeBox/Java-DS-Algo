import java.util.Scanner;
import java.util.Stack;

public class DeleteMid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter The Value For " + i + " th Element -> ");
            st.push(scanner.nextInt());
        }
        System.out.print("Stack Before Deletion -> ");
        for (int i = st.size()-1; i >= 0; i--) {
            System.out.print(st.get(i) + " ");
        }
        System.out.println();
        int mid = st.size() / 2;
        deleteMid(st, mid);
        System.out.print("Stack After Deletion -> ");
        while (!(st.isEmpty())) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
        System.out.println();
    }

    public static void deleteMid(Stack<Integer> s, int mid) {
        if (mid == 0) {
            s.pop();
            return;
        }
        int top = s.pop();
        deleteMid(s, mid - 1);
        s.push(top);
    }
}
