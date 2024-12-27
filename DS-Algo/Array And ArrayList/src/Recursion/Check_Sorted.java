import java.util.ArrayList;
import java.util.Scanner;

public class Check_Sorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arrList.add(i, scanner.nextInt());
        }

        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }

        System.out.println();
        System.out.println(checkSorted(arrList, 0, arrList.size() - 1));
    }

    // Check Sorted
    public static boolean checkSorted(ArrayList<Integer> arrList, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (arrList.get(i) > arrList.get(j)) {
            return false;
        }
        boolean ans = checkSorted(arrList, i + 1, j);
        return ans;
    }
}