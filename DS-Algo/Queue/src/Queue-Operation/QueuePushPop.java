import java.util.LinkedList;
import java.util.Queue;

public class QueuePushPop {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Queue<Integer> que = push(arr);
        System.out.print("Queue Elements -> ");
        pop(que);
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
}