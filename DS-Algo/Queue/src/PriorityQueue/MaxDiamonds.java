package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxDiamonds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        System.out.print("Enter The ELement For Array -> ");
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
        long maxDiamonds = maxDiamonds(A, A.length, 2);
        System.out.println("Max Diamonds -> " + maxDiamonds);
    }

    static long maxDiamonds(int[] A, int N, int K) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int diamond : A) {
            maxHeap.add(diamond);
        }
        long totalDiamonds = 0;
        while (K-- > 0) {
            int maxDiamonds = maxHeap.poll();
            totalDiamonds += maxDiamonds;
            maxHeap.add(maxDiamonds / 2);
        }
        return totalDiamonds;
    }
}