public class Power {
    public static void main(String[] args) {
        System.out.println("Power -> " + power(5));
    }

    // Power
    public static int power(int x) {
        if (x == 0) {
            return 1;
        }
        int power = power(x - 1);
        int ans = 2 * power;
        return ans;
    }
}
