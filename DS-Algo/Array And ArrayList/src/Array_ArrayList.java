import java.util.ArrayList;

public class Array_ArrayList {
    public static void main(String[] args) {
        // Static Array
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        // Size Check Of Static Array
        System.out.println("Size Of arr -> " + arr.length);

        // Printing Elements Of arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Dynamic Array
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(0);
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);

        // Size Check Of Dynamic Array
        System.out.println("Size Of arrList -> " + arrList.size());

        // Printing Elements Of arrList
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
    }
}
