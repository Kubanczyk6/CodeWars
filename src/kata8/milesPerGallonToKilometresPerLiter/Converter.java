package kata8.milesPerGallonToKilometresPerLiter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {
    public static final BigDecimal convertMilesToKilometres = BigDecimal.valueOf(1.609344);
    public static final BigDecimal convertGallonToLitres = BigDecimal.valueOf(4.54609188);

    public static float mpgToKPM(final float mpg) {

        return BigDecimal.valueOf(mpg).multiply(convertMilesToKilometres).divide(convertGallonToLitres, 2, RoundingMode.HALF_UP).floatValue();
    }
}
