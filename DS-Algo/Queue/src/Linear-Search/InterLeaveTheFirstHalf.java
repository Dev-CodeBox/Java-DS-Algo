import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterLeaveTheFirstHalf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            q.offer(scanner.nextInt());
        }
        System.out.print("Before Rearrangement -> ");
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        ArrayList<Integer> arr = rearrangeQueue(q.size(), q);

        System.out.print("After Rearrangement -> ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        ArrayList<Integer> arr = new ArrayList<>();

        Queue<Integer> temp = new LinkedList<>();

        int index = N / 2;
        while (index >= 1) {
            temp.offer(q.poll());
            index--;
        }

        while (!(temp.isEmpty())) {
            q.offer(temp.poll());
            q.offer(q.poll());
        }

        while (!q.isEmpty()) {
            arr.add(q.poll());
        }

        return arr;
    }
}