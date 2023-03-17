package kata8.findTheForceOfGravityBetweenTwoObjects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new double[] {8.722986256867784E13, 1.8870658149452124E7, 9.18842030369058E12}, new String[] {"?g", "g", "?m"}));
    }

    private final static BigDecimal constans = BigDecimal.valueOf(6.67*Math.pow(10,-11));

    public static double solution(double[] arrVal, String[] arrUnit) {
        System.out.println(Arrays.toString(arrUnit));
        System.out.println(Arrays.toString(arrVal));
        double m1Unit = 1;
        double m2Unit = 1;
        double lengthUnit = 1;


            if ("mg".equals(arrUnit[0])) {
                m1Unit = Math.pow(10, -6);
            } else if ("g".equals(arrUnit[0])) {
                m1Unit = Math.pow(10, -3);
            } else if("lb".equals(arrUnit[0])){
                m1Unit = 0.453592;
            } else if("?g".equals(arrUnit[0])){
                m1Unit=Math.pow(10,-9);
            }
            if ("mg".equals(arrUnit[1])) {
                m2Unit = Math.pow(10, -6);
            } else if ("g".equals(arrUnit[1])) {
                m2Unit = Math.pow(10, -3);
            } else if("lb".equals(arrUnit[1])){
                m2Unit = 0.453592;
            }else if("?g".equals(arrUnit[1])){
                m2Unit=Math.pow(10,-9);
            }
            if ("mm".equals(arrUnit[2])) {
                lengthUnit = Math.pow(10, -3);
            } else if ("cm".equals(arrUnit[2])) {
                lengthUnit = Math.pow(10, -2);
            } else if ("ft".equals(arrUnit[2])){
                lengthUnit=0.3048;
            } else if("?m".equals(arrUnit[2])){
                lengthUnit=Math.pow(10,-6);
            }


        double m1m2Multiplication=0;
        for (int i = 0; i < arrVal.length-2; i++) {
            m1m2Multiplication=arrVal[i]*m1Unit*arrVal[i+1]*m2Unit;
        }
        return (constans.multiply(BigDecimal.valueOf(m1m2Multiplication)))
                .divide(BigDecimal.valueOf(Math.pow(arrVal[2]*lengthUnit,2)),50, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
