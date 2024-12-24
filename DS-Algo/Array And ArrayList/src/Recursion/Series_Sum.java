public class Series_Sum {
    public static void main(String[] args) {
        System.out.println("Series Sum -> " + seriesSum(10));
    }

    // Series Sum
    public static int seriesSum(int num) {
        if (num == 1) {
            return num;
        }
        int series = seriesSum(num - 1);
        int sum = num + series;
        return sum;
    }
}