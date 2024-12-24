import java.util.ArrayList;
import java.util.Scanner;

public class Print_Array {
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
        System.out.print("Printing Array Using Recursion : ");
        printArray(arrList, 0);
    }

    // Print Array
    public static void printArray(ArrayList<Integer> arrList, int index) {
        if (index == arrList.size()) {
            return;
        }
        System.out.print(arrList.get(index) + " ");
        printArray(arrList, index + 1);
    }
}
