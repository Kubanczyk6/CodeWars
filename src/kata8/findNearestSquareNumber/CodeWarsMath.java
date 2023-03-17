package kata8.findNearestSquareNumber;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CodeWarsMath {
    public static void main(String[] args) {
        System.out.println(nearestSq(111));
    }
    public static int nearestSq(final int n){
return (int) Math.pow(BigDecimal.valueOf(Math.sqrt(n)).setScale(0, RoundingMode.HALF_UP).doubleValue(),2);
    }
}
