import java.util.Scanner;

public class CustomStackUsingNode {
    class StackNode {
        int data;
        StackNode next;

        StackNode(int a) {
            data = a;
            next = null;
        }
    }

    StackNode top;

    CustomStackUsingNode() {
        this.top = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomStackUsingNode st = new CustomStackUsingNode();
        st.push(scanner.nextInt());
        st.push(scanner.nextInt());
        st.push(scanner.nextInt());
        st.push(scanner.nextInt());
        st.push(scanner.nextInt());
    }

    public void push(int data) {
        if (top == null) {
            StackNode node = new StackNode(data);
            top = node;
        } else {
            StackNode node = new StackNode(data);
            node.next = top;
            top = node;
        }
    }
}
