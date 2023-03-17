package kata7.SummationTriangle;

public class TraingleSum {
    public static void main(String[] args) {
        System.out.println(getSum(4));
    }

    public static long getSum(int n) {
        long temp = 1;
        long counter = 1;
        long result = 1;
        for (int i = 0; i < n; i++) {
            counter += 4;
            temp = temp + counter;
            result += temp;
        }

        return n == 0 ? 1 : result;
    }
}
