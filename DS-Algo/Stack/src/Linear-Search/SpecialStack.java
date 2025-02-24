import java.util.Stack;

public class SpecialStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // Push Element To Stack
        push(1, st);
        // Pop Element From Stack
        System.out.println("Poped Element -> " + pop(st));
        // Min In Stack
        System.out.println("Min In Stack -> " + min(st, Integer.MAX_VALUE));
        // Is Stack Full
        System.out.println("Is Full -> " + isFull(st, st.size()));
        // Is Stack Empty
        System.out.println("Is Empty -> " + isEmpty(st));
    }

    public static void push(int a, Stack<Integer> s) {
        s.push(a);
    }

    public static int pop(Stack<Integer> s) {
        return s.pop();
    }

    public static int min(Stack<Integer> s, int min) {
        for (int i = s.size() - 1; i >= 0; i--) {
            if (s.get(i) < min) {
                min = s.get(i);
            }
        }
        return min;
    }

    public static boolean isFull(Stack<Integer> s, int n) {
        return s.size() == n;
    }

    public static boolean isEmpty(Stack<Integer> s) {
        if (!s.isEmpty()) {
            return false;
        }
        return true;
    }
}
