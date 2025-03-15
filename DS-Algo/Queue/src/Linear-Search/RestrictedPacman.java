public class RestrictedPacman {
    public static void main(String[] args) {
        System.out.println("Restricted Pacman -> " + candies(5, 5));
    }

    public static int candies(int m, int n) {
        return ((m - 1) * (n - 1)) / 2;
    }
}