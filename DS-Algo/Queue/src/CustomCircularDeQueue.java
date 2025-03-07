public class CustomCircularDeQueue {
    static int[] arr;
    static int size;
    static int front, rear;

    CustomCircularDeQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.front = -1;
        this.rear = -1;
    }

    public static void main(String[] args) {
        CustomCircularDeQueue deq = new CustomCircularDeQueue(5);
    }
}