public class Methods {
    public static void main(String[] args) {
        System.out.println("Sum -> " + sum(5, 10));
        System.out.println("Factorial -> " + factorial(5));
        System.out.println("Circumference -> " + circumference(10));
        System.out.println("Min -> " + findMin(10, 20));
        System.out.println("Positive -> " + checkPos(5));
    }

    // Sum
    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Factorial
    public static int factorial(int x) {
        int ans = 1;
        for (int i = x; i >= 1; i--) {
            ans = ans * i;
        }
        return ans;
    }

    // Circumference
    public static double circumference(int radius) {
        double pie = 3.14;
        double circumference = 2 * pie * radius;
        return circumference;
    }

    // Find Minimum
    public static int findMin(int x, int y) {
        if (x < y) {
            return x;
        }
        return y;
    }

    // Check Positive
    public static boolean checkPos(int x) {
        if (x < 0) {
            return false;
        }
        return true;
    }
}