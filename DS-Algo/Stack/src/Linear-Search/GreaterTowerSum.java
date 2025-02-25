import java.util.ArrayList;
import java.util.Stack;

public class GreaterTowerSum {
    public static void main(String[] args) {
        int[] arr = { 112, 133, 161, 311, 122, 512, 1212, 0, 19212 };
        System.out.println("Greater Tower Sum -> " + SaveGotham(arr));
    }

    public static int SaveGotham(int arr[]) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        arrList.add(0);
        st.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            int element = arr[i];
            while ((!st.isEmpty()) && st.peek() <= element) {
                st.pop();
            }
            arrList.add(st.isEmpty() ? 0 : st.peek());
            st.push(element);
        }
        int arrListSum = 0;
        for (int num : arrList) {
            arrListSum += num;
        }
        return (int) (arrListSum % 1000000007);
    }
}
