import java.util.ArrayList;
import java.util.Scanner;

public class Find_Target {
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
        System.out.println("Target Found -> " + findTarget(arrList, 5, 0));
    }

    // Find Target
    public static boolean findTarget(ArrayList<Integer> arrList, int target, int index) {
        if (index == arrList.size()) {
            return false;
        }
        if (arrList.get(index) == target) {
            return true;
        }
        boolean ans = findTarget(arrList, target, index + 1);
        return ans;
    }
}