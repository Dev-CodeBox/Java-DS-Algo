import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsing2Queue {
    public static Queue<Integer> q1 = new LinkedList<Integer>();
    public static Queue<Integer> q2 = new LinkedList<Integer>();

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.print("Stack Using 2 Queue -> ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }

    public static void push(int a) {
        q1.offer(a);
    }

    public static int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int top = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }
}
