import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = nextLargerElement(arr);
        System.out.println(list);
    }
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        Stack<Integer>st = new Stack<>();
        st.push(-1);
        st.push(arr[arr.length-1]);
        for(int i = arr.length-2; i >= 0; i--){
            int ele = arr[i];
            while(!st.isEmpty() && st.peek() <= ele){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(-1);
            }
            list.add(st.peek());
            st.push(ele);
        }
        Collections.reverse(list);
        return list;
    }
}