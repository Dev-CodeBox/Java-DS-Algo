import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {
    public static void main(String[] args) {
        ArrayList<String> arr = generate(5);
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static ArrayList<String> generate(int n) {
        ArrayList<String> arr = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 0; i < n; i++) {
            String binary = q.poll();
            arr.add(binary);
            q.add(binary + "0");
            q.add(binary + "1");
        }
        return arr;
    }
}