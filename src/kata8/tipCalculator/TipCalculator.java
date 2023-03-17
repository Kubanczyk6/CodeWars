package kata8.tipCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println(calculateTip(30, "poor"));
    }

    public static Integer calculateTip(double amount, String rating) {
        System.out.println(rating);
        System.out.println(amount);
        Integer tip = 0;
        switch (rating.toLowerCase()) {
            case "terrible"-> tip=tip;
            case "poor" ->
                    tip = BigDecimal.valueOf(amount).multiply(BigDecimal.valueOf(0.05)).setScale(0, RoundingMode.CEILING).intValue();
            case "good" ->
                    tip = BigDecimal.valueOf(amount).multiply(BigDecimal.valueOf(0.1)).setScale(0, RoundingMode.CEILING).intValue();
            case "great" ->
                    tip = BigDecimal.valueOf(amount).multiply(BigDecimal.valueOf(0.15)).setScale(0, RoundingMode.CEILING).intValue();
            case "excellent" ->
                    tip = BigDecimal.valueOf(amount).multiply(BigDecimal.valueOf(0.2)).setScale(0, RoundingMode.CEILING).intValue();
            default -> tip = null;
        }
        return tip;
    }
}
