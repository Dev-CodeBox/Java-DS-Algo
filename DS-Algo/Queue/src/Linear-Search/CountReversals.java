public class CountReversals {
    public static void main(String[] args) {
        String str = "}{{}}{{{";
        System.out.println("Reversals -> " + countRev(str));
    }

    public static int countRev(String s) {
        int n = s.length();
        if (n % 2 != 0)
            return -1;
        int open = 0, close = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '{') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    close++;
                }
            }
        }
        return (open + 1) / 2 + (close + 1) / 2;
    }
}
