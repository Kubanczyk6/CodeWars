package kata8.formattingDecimalPlaces;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(TwoDecimalPlaces(4.659725356));
    }
    public static double TwoDecimalPlaces(double number)
    {

        return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
