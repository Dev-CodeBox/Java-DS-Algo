import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            q.offer(scanner.nextInt());
        }
        System.out.print("Before Reversing -> ");
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        q = rev(q);
        System.out.print("After Reversing -> ");
        Iterator<Integer> jt = q.iterator();
        while (jt.hasNext()) {
            System.out.print(jt.next() + " ");
        }
        System.out.println();
    }

    public static Queue<Integer> rev(Queue<Integer> q) {
        reverse(q);
        return q;
    }

    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int ele = q.poll();
        reverse(q);
        q.offer(ele);
    }
}