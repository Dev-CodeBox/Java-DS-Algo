import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstK {
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
        queue = modifyQueue(queue, 3);
        System.out.print("After Reversal -> ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
        scanner.close();
    }

    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }
        while (!st.isEmpty()) {
            q.offer(st.pop());
        }
        int rem = q.size() - k;
        for (int i = 0; i < rem; i++) {
            q.offer(q.poll());
        }
        return q;
    }
}
