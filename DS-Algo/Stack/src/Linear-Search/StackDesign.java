import java.util.Scanner;
import java.util.Stack;

public class StackDesign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Size For Arr -> ");
        int[] arr = new int[scanner.nextInt()];
        System.out.println("Enter The Value For Array Element -> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        _push(arr, st);
        _pop(st);
    }

    public static Stack<Integer> _push(int arr[], Stack<Integer> st) {
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }
        return st;
    }

    public static void _pop(Stack<Integer> s) {
        while (!(s.isEmpty())) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}