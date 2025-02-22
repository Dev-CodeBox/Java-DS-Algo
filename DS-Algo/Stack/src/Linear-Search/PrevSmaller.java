import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PrevSmaller {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        List<Integer> list = leftSmaller(arr.length, arr);
        System.out.println(list);
    }

    public static List<Integer> leftSmaller(int n, int arr[]) { 
        ArrayList<Integer>list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i = 0; i < n; i++){
            int ele = arr[i];
            while((!st.isEmpty()) && st.peek() >= ele){
                st.pop();
            }
            list.add(st.peek());
            st.push(ele);
        }
        return list;
    }
}
