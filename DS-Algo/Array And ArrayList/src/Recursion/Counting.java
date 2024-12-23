public class Counting {
    public static void main(String[] args) {
        System.out.print("Counting -> ");
        counting(5);
    }

    // Counting
    public static void counting(int x) {
        if (x == 0) {
            return;
        }
        counting(x - 1);
        System.out.print(x + " ");
    }
}
