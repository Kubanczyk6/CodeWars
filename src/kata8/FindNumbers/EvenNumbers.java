package kata8.FindNumbers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(i->i%divider==0).toArray();
    }
}
