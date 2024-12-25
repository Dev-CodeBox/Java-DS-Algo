import java.util.ArrayList;
import java.util.Scanner;

public class Find_Max {
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
        System.out.println("Max Num -> " + findMax(arrList, Integer.MIN_VALUE, 0));
    }

    // Find Max
    public static int findMax(ArrayList<Integer> arrList, int max, int index) {
        if (index == arrList.size()) {
            return max;
        }
        if (arrList.get(index) > max) {
            max = arrList.get(index);
        }
        int ans = findMax(arrList, max, index + 1);
        return ans;
    }
}
