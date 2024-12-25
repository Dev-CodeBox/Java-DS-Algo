import java.util.ArrayList;
import java.util.Scanner;

public class Find_Min {
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
        System.out.println("Min Num -> " + findMin(arrList, Integer.MAX_VALUE, 0));
    }

    // Find Min
    public static int findMin(ArrayList<Integer> arrList, int min, int index) {
        if (index == arrList.size()) {
            return min;
        }
        if (arrList.get(index) < min) {
            min = arrList.get(index);
        }
        int ans = findMin(arrList, min, index + 1);
        return ans;
    }
}
