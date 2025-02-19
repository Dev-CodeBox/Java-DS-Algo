import java.util.Scanner;

public class TwoCustomStacks {
    int[] arr;
    int size;
    int top1;
    int top2;

    TwoCustomStacks(int size) {
        this.arr = new int[size];
        this.size = size;
        this.top1 = -1;
        this.top2 = arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Size For Stack -> ");
        TwoCustomStacks st = new TwoCustomStacks(scanner.nextInt());
        st.push1(scanner.nextInt());
        st.push1(scanner.nextInt());
        st.push1(scanner.nextInt());
        st.push2(scanner.nextInt());
        st.push2(scanner.nextInt());
        System.out.println("Popped Element Stack 1 -> " + st.pop1());
        System.out.println("Popped Element Stack 2 -> " + st.pop2());
    }

    public void push1(int data) {
        if ((top2 - top1) == 1) {
            System.out.println("Stack Is Full");
            return;
        } else {
            top1++;
            arr[top1] = data;
        }
    }

    public void push2(int data) {
        if ((top2 - top1) == 1) {
            System.out.println("Stack Is Full");
            return;
        } else {
            top2--;
            arr[top2] = data;
        }
    }

    public int pop1() {
        int popped = -1;
        if (top1 == -1) {
            return -1;
        } else {
            popped = arr[top1];
            top1--;
        }
        return popped;
    }

    public int pop2() {
        int popped = -1;
        if (top2 == arr.length) {
            return -1;
        } else {
            popped = arr[top2];
            top2++;
        }
        return popped;
    }
}