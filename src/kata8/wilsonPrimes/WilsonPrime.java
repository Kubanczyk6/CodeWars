package kata8.wilsonPrimes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WilsonPrime {

    public static void main(String[] args) {
        System.out.println(am_i_wilson(563));
    }

    public static boolean am_i_wilson(double n) {

        String result = (factorial(n - 1).add(BigDecimal.ONE)).divide(BigDecimal.valueOf(n * n), 2, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();
        return checkFirstNumber(n) && !result.contains(".");
    }

    private static BigDecimal factorial(double n) {
        return n > 0 ? factorial(n - 1).multiply(BigDecimal.valueOf(n)) : BigDecimal.ONE;
    }

    private static boolean checkFirstNumber(double n) {

        boolean isFirst = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isFirst = false;
                break;
            }
        }
        return isFirst;
    }


}
