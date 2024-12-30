import java.util.ArrayList;
public class Permutation {
    public static void main(String[] args) {
        String str = new String("abc");
        ArrayList<String> arrList = new ArrayList<>();
        permutations(str.toCharArray(), 0, arrList);
        System.out.println(arrList);
    }

    // Permutations
    public static void permutations(char[] str, int index, ArrayList<String> arrList) {
        if (index == str.length) {
            arrList.add(new String(str));
            return;
        }
        for (int i = index; i < str.length; i++) {
            swap(str, index, i);
            permutations(str, index + 1, arrList);
            swap(str, index, i);
        }
    }

    // Swap
    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}