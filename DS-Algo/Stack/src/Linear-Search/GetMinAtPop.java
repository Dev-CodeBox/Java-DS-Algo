import java.util.Scanner;
import java.util.Stack;

public class GetMinAtPop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter The Value -> ");
            st.push(scanner.nextInt());
        }
        System.out.print("Min In Stack -> ");
        getMinAtPop(st);
    }

    public static void getMinAtPop(Stack<Integer> s) {
        while (!s.isEmpty()) {
            int min = Integer.MAX_VALUE;
            for (int i = s.size() - 1; i >= 0; i--) {
                if (s.get(i) < min) {
                    min = s.get(i);
                }
            }
            System.out.print(min + " ");
            s.pop();
        }
    }
}