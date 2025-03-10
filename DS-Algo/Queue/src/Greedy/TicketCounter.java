import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class TicketCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number Of Persons -> ");
        int lastPerson = distributeTicket(scanner.nextInt(), 3);
        System.out.println("The last person to get the ticket -> " + lastPerson);
    }

    public static int distributeTicket(int N, int K) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = N;
        for (int i = 1; i <= N; i++) {
            dq.offerLast(i);
        }
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while (!dq.isEmpty()) {
            for (int i = 0; i < K && !dq.isEmpty(); i++) {
                st1.push(dq.pollFirst());
            }
            if (dq.isEmpty()) {
                return st1.peek();
            }
            for (int i = 0; i < K && !dq.isEmpty(); i++) {
                st2.push(dq.pollLast());
            }
            if (dq.isEmpty()) {
                return st2.peek();
            }
        }
        return -1;
    }
}