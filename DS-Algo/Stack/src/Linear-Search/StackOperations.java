import java.util.Scanner;
import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack st = new Stack<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value For " + i + " th Of Stack -> ");
            st.push(scanner.nextInt());
        }

        while (!(st.isEmpty())) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
        System.out.println();
    }
}
