import java.util.LinkedList;
import java.util.Queue;

public class QueueOperation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        insert(q, 1);
        insert(q, 2);
        insert(q, 3);
        insert(q, 4);
        insert(q, 5);
        insert(q, 2);
        insert(q, 3);
        insert(q, 1);
        System.out.println(findFrequency(q, 1));
        System.out.println(findFrequency(q, 3));
        System.out.println(findFrequency(q, 2));
        System.out.println(findFrequency(q, 9));
        System.out.println(findFrequency(q, 10));
    }

    public static void insert(Queue<Integer> q, int k) {
        q.offer(k);
    }

    public static int findFrequency(Queue<Integer> q, int k) {
        int count = 0;
        for (int num : q) {
            if (num == k) {
                count++;
            }
        }
        return count == 0 ? -1 : count;
    }
}
