public class CustomCircularQueue {
    static int[] arr;
    static int size;
    static int front, end;

    CustomCircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.front = -1;
        this.end = -1;
    }

    public static void main(String[] args) {
        CustomCircularQueue q = new CustomCircularQueue(5);
    }
}