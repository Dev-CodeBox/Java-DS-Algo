public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial -> " + factorial(5));
    }

    // Factorial
    public static int factorial(int x) {
        if (x == 1) {
            return x;
        }
        int factorial = factorial(x - 1);
        int ans = x * factorial;
        return ans;
    }
}