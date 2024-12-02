import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scanner.nextInt();

        // Square
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Rectangle
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n * 2; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Hollow Rectangle
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n * 2; col++) {
                if (row == 0 || row == n - 1 || col == 0 || col == n * 2 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Right Half Pyramid
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Triangle
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Rhombus
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Diamond
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 0; row < n - 1; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Number Increasing Pyramid
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }

        // Number Changing Pyramid
        int num = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(num + 1 + " ");
                num++;
            }
            System.out.println();
        }

        // Zero-One Pyramid
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}