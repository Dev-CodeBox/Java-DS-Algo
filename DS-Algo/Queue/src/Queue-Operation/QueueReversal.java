import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(scanner.nextInt());
        queue.offer(scanner.nextInt());
        queue.offer(scanner.nextInt());
        queue.offer(scanner.nextInt());
        queue.offer(scanner.nextInt());
        System.out.print("Before Reversal -> ");
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        queue = reverseQueue(queue);
        System.out.print("After Reversal -> ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
        scanner.close();
    }

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> st = new Stack<>();
        while (!queue.isEmpty()) {
            st.push(queue.poll());
        }
        while (!st.isEmpty()) {
            queue.offer(st.pop());
        }
        return queue;
    }
}