import java.util.Scanner;
import java.util.ArrayList;
public class Last_Occurance{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> arrList = new ArrayList<Character>();
        System.out.print("Enter The Size of the arrList -> ");
        int size = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter The Element For " + i + " th Index -> ");
            arrList.add(scanner.nextLine().charAt(0));
        }
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();
        lastOccurrence(arrList, 'b', arrList.size() - 1);
    }

    // Last Occurrence
    public static void lastOccurrence(ArrayList<Character> arrList, char target, int index) {
        if (index == 0) {
            return;
        }
        if (arrList.get(index) == target) {
            System.out.print("Last Occurance Of " + target + " Is Found At -> " + index);
            return;
        }
        lastOccurrence(arrList, target, index - 1);
    }
}