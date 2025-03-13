import java.util.PriorityQueue;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(4);
        pq.add(6);
        pq.add(8);
        pq.add(10);
        pq.offer(5);
        pq.offer(10);
        pq.offer(15);
        pq.offer(20);
        pq.offer(25);
        System.out.print("Before Removal -> ");
        for (int num : pq) {
            System.out.print(num + " ");
        }
        System.out.println();
        pq.poll();
        pq.poll();
        System.out.print("After Removal -> ");
        for (int num : pq) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Front Element -> " + pq.peek());
        System.out.println("Empty Check -> " + pq.isEmpty());
        System.out.println("Size Check -> " + pq.size());
        System.out.println("Find Element -> " + pq.contains(10));
    }
}
