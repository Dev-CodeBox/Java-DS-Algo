package Hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StreamFirstNonRep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String str = firstNonRepeating(s);
        System.out.println("First Non Repeating -> " + str);
    }

    public static String firstNonRepeating(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            q.offer(ch);
            while (!q.isEmpty()) {
                char front = q.peek();
                if (freq.get(front) == 1) {
                    sb.append(front);
                    break;
                } else {
                    q.poll();
                }
            }
            if (q.isEmpty()) {
                sb.append("#");
            }
        }
        return sb.toString();
    }
}
