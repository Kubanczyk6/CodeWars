package kata7.areaOfACircle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
    public static void main(String[] args) {
        System.out.println(area(43.2673));
    }

    public static double area(double radius) {
        if(radius<=0){
            throw new IllegalArgumentException();
        }
        return Math.round(Math.PI*radius*radius*100)/100.;

    }
}
