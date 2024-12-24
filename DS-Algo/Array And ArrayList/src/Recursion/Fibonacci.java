public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci -> " + fibonacci(5));
    }

    // Fibonacci
    public static int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        int ans = fibonacci(num - 1) + fibonacci(num - 2);
        return ans;
    }
}