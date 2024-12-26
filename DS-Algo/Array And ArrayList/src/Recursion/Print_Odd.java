import java.util.ArrayList;
import java.util.Scanner;

public class Print_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        System.out.print("Enter The Size For arrList : ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter The Element For " + i + "th Index : ");
            arrList.add(i, scanner.nextInt());
        }
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();
        System.out.print("Odds In arrList -> ");
        printOdd(arrList, 0);
    }

    // Print Odd
    public static void printOdd(ArrayList<Integer> arrList, int index) {
        if (index == arrList.size()) {
            return;
        }
        if (arrList.get(index) % 2 != 0) {
            System.out.print(arrList.get(index) + " ");
        }
        printOdd(arrList, index + 1);
    }
}