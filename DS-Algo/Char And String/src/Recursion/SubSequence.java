import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str = new String("Dev");
        ArrayList<String> arrList = new ArrayList<String>();
        int size = 1;
        for (int i = 0; i < str.length(); i++) {
            size = size * 2;
        }
        subSequence(str, 0, "", arrList);
        for (int i = 0; i < size; i++) {
            System.out.println(arrList.get(i) + " ");
        }
        int subSeqCount = arrList.size();
        System.out.println("Total SubSequence -> " + subSeqCount);
    }

    // SubSequence
    public static void subSequence(String str, int index, String output, ArrayList<String> ans) {
        if (index == str.length()) {
            ans.add(output);
            return;
        }
        char ch = str.charAt(index);
        subSequence(str, index + 1, output + ch, ans);
        subSequence(str, index + 1, output, ans);
    }
}