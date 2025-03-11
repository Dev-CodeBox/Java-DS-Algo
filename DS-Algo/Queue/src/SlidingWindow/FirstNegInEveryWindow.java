import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class FirstNegInEveryWindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Size -> ");
        int[] arr = new int[scanner.nextInt()];
        System.out.print("Enter Elements For Array -> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        List<Integer> list = firstNegativeInteger(arr, 2);
        System.out.print("First Neg In EveryWindow -> ");
        for (int ele : list) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static List<Integer> firstNegativeInteger(int arr[], int k) {
        List<Integer> ansList = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.offer(i);
            }
        }
        if (q.isEmpty()) {
            ansList.add(0);
        } else {
            ansList.add(arr[q.peek()]);
        }

        for (int i = k; i < arr.length; i++) {
            if (!q.isEmpty() && i - q.peek() >= k) {
                q.poll();
            }
            if (arr[i] < 0) {
                q.offer(i);
            }
            if (q.isEmpty()) {
                ansList.add(0);
            } else {
                ansList.add(arr[q.peek()]);
            }
        }
        return ansList;
    }
}