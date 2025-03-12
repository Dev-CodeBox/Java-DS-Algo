import java.util.Stack;

public class QueueUsingStack {
    public static Stack<Integer> input = new Stack<Integer>();
    public static Stack<Integer> output = new Stack<Integer>();

    public static void main(String[] args) {
        enqueue(2);
        enqueue(3);
        System.out.println(dequeue());
        enqueue(4);
        System.out.println(dequeue());
    }

    public static int dequeue() {
        if (output.isEmpty()) {
            if (input.isEmpty()) {
                return -1;
            }
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public static void enqueue(int x) {
        input.push(x);
    }
}