package kata8.beginnerReduceAndGrow;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static int grow(int[] x) {
        int result = 1;
        for (int i : x) {
            result *= i;
        }

        return result;

    }
}
