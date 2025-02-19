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
        TwoCustomStacks st = new TwoCustomStacks();
    }
}