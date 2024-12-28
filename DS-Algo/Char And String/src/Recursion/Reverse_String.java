import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrList = new ArrayList<String>();
        System.out.print("Enter The Size of the arrList -> ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter The Element For " + i + " th Index -> ");
            arrList.add(i, scanner.next());
        }
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();
        reverseString(arrList, 0, arrList.size() - 1);
        System.out.print("Reversed String Array -> ");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
    }

    // Reverse String
    public static void reverseString(ArrayList<String> arrList, int first, int last) {
        if (first >= last) {
            return;
        }
        String temp = arrList.get(first);
        arrList.set(first, arrList.get(last));
        arrList.set(last, temp);
        reverseString(arrList, first + 1, last - 1);
    }
}