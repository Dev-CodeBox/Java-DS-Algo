import java.util.ArrayList;
import java.util.Scanner;

public class Merge_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrList2 = new ArrayList<Integer>();
        System.out.print("Enter the size of the arrList1: ");
        int sizeArrList1 = scanner.nextInt();
        for (int i = 0; i < sizeArrList1; i++) {
            System.out.print("Enter element Of arrList1 " + i + ": ");
            arrList1.add(i, scanner.nextInt());
        }
        System.out.print("Enter the size of the arrList2: ");
        int sizeArrList2 = scanner.nextInt();
        for (int i = 0; i < sizeArrList2; i++) {
            System.out.print("Enter element Of arrList2 " + i + ": ");
            arrList2.add(i, scanner.nextInt());
        }
        System.out.print("arrList1 -> ");
        for (int i = 0; i < arrList1.size(); i++) {
            System.out.print(arrList1.get(i) + " ");
        }
        System.out.println();
        System.out.print("arrList2 -> ");
        for (int i = 0; i < arrList2.size(); i++) {
            System.out.print(arrList2.get(i) + " ");
        }
        System.out.println();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        mergeSort(arrList1, arrList2, ans);
        System.out.print("Merged Sorted Array -> ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    // Merge Sort
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> arr, ArrayList<Integer> brr, ArrayList<Integer> ans) {
        int i = 0;
        int j = 0;
        while (i < arr.size() && j < brr.size()) {
            if (arr.get(i) < brr.get(j)) {
                ans.add(arr.get(i));
                i++;
            } else if (arr.get(i) > brr.get(j)) {
                ans.add(brr.get(j));
                j++;
            }
        }

        if (i < arr.size()) {
            while (i < arr.size()) {
                ans.add(arr.get(i));
                i++;
            }
        } else if (j < brr.size()) {
            while (j < brr.size()) {
                ans.add(brr.get(j));
                j++;
            }
        }
        return ans;
    }
}