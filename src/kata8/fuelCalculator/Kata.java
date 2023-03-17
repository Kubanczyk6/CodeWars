package kata8.fuelCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Kata {
    public static void main(String[] args) {
        System.out.println(fuelPrice(8,2.5));
    }
    public static double fuelPrice(int litres, double pricePerLitre) {

        return BigDecimal.valueOf(litres*(pricePerLitre-Math.min(0.25, litres/2*0.05)))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
