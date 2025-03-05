import java.util.Stack;

public class QueueUsing2Stacks {

    public static Stack<Integer> s1 = new Stack<Integer>();
    public static Stack<Integer> s2 = new Stack<Integer>();

    public static void main(String[] args) {
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.print("Queue Using 2 Stacks -> ");
        while (!s1.isEmpty()) {
            System.out.print(s1.pop() + " ");
        }
        System.out.println();
    }

    public static void Push(int x) {
        s1.push(x);
    }

    public static int Pop() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}