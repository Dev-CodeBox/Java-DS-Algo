import java.util.LinkedList;
import java.util.Queue;

public class QueuePushPop {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5 };
        // Queue<Integer> que = push(arr);
        // System.out.print("Queue Elements -> ");
        // pop(que);

        Queue<Integer> que = new LinkedList<>();
        // Push
        enqueue(que, 1);
        // Pop
        // dequeue(que);
        // Front
        System.out.println("Front Element -> " + front(que));
        // Search
        System.out.println("Found -> " + find(que, 0));
    }

    public static Queue<Integer> push(int arr[]) {
        Queue<Integer> que = new LinkedList<>();
        for (int num : arr) {
            que.add(num);
        }
        return que;
    }

    public static void pop(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
        System.out.println();
    }

    public static void enqueue(Queue<Integer> q, int x) {
        q.add(x);
    }

    public static void dequeue(Queue<Integer> q) {
        q.poll();
    }

    public static int front(Queue<Integer> q) {
        return q.peek();
    }

    public static String find(Queue<Integer> q, int x) {
        for (int num : q) {
            if (num == x) {
                return "Yes";
            }
        }
        return "No";
    }
}