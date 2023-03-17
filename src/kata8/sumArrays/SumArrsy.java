package kata8.sumArrays;

import java.util.Arrays;

public class SumArrsy {
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
