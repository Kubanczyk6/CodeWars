package kata7.sumOfTheFirst;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NthSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));

    }

    public static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        } else if (n == 1) {
            return "1.00";
        } else if (n == 2) {
            return "1.25";
        }

        int counter = 1;
        int denominator = 4;
        int j = 0;
        BigDecimal sum = BigDecimal.ONE.add(BigDecimal.valueOf((double) counter / denominator));

        for (int i = 3; i <= n; i++) {
            j++;
            sum = sum.add(BigDecimal.valueOf((double) counter / (denominator + 3 * j)));

        }
        BigDecimal decimal = sum.setScale(2, RoundingMode.HALF_UP);
        String result = String.valueOf(decimal);
        return result;
    }
}
