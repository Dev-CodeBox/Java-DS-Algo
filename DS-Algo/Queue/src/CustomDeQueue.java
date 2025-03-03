public class CustomDeQueue {
    static int[] arr;
    static int size;
    static int front, rear;

    CustomDeQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.front = -1;
        this.rear = -1;
    }

    public static void main(String[] args) {
        CustomDeQueue deq = new CustomDeQueue(5);
    }
}