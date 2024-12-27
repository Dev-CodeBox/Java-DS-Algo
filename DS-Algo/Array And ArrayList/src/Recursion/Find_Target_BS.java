import java.util.ArrayList;
import java.util.Scanner;

public class Find_Target_BS {
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
        findTarget(arrList, 5, 0, arrList.size() - 1);
    }

    // Find Target
    public static void findTarget(ArrayList<Integer> arrList, int target, int start, int end) {
        int middle = start + (end - start) / 2;
        if (start > end) {
            System.out.print(target + " Not Found");
            return;
        }
        if (arrList.get(middle) == target) {
            System.out.println(target + " Found At " + middle + "th Index");
            return;
        } else if (arrList.get(middle) > target) {
            findTarget(arrList, target, start, middle - 1);
        } else if (arrList.get(middle) < target) {
            findTarget(arrList, target, middle + 1, end);
        }
    }
}