import java.util.ArrayList;
import java.util.Scanner;

public class Merge_Sort_DNC {
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
        mergeSort(arrList, 0, arrList.size() - 1);
        System.out.print("Merged Sorted Array DNC -> ");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
    }

    // DNC
    public static void dnc(ArrayList<Integer> arrList, int start, int mid, int end) {
        int leftArrSize = mid - start + 1;
        int rightArrSize = end - mid;
        ArrayList<Integer> leftArr = new ArrayList<>(leftArrSize);
        ArrayList<Integer> rightArr = new ArrayList<>(rightArrSize);
        for (int i = 0; i < leftArrSize; i++) {
            leftArr.add(arrList.get(start + i));
        }
        for (int i = 0; i < rightArrSize; i++) {
            rightArr.add(arrList.get(mid + 1 + i));
        }

        int i = 0;
        int j = 0;
        int mainArrIndex = start;
        while (i < leftArrSize && j < rightArrSize) {
            if (leftArr.get(i) <= rightArr.get(j)) {
                arrList.set(mainArrIndex, leftArr.get(i));
                i++;
            } else if (leftArr.get(i) >= rightArr.get(j)) {
                arrList.set(mainArrIndex, rightArr.get(j));
                j++;
            }
            mainArrIndex++;
        }
        if (i < leftArrSize) {
            while (i < leftArrSize) {
                arrList.set(mainArrIndex, leftArr.get(i));
                i++;
                mainArrIndex++;
            }
        } else if (j < rightArrSize) {
            while (j < rightArrSize) {
                arrList.set(mainArrIndex, rightArr.get(j));
                j++;
                mainArrIndex++;
            }
        }
    }

    // Merge Sort
    public static void mergeSort(ArrayList<Integer> arrList, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arrList, start, mid);
        mergeSort(arrList, mid + 1, end);
        dnc(arrList, start, mid, end);
    }
}