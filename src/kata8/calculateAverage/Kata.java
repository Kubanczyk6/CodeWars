package kata8.calculateAverage;

import java.util.Arrays;

public class Kata {
    public static double find_average(int[] array){
return Arrays.stream(array).average().getAsDouble();
    }
}
