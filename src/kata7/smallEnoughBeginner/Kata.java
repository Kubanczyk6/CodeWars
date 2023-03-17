package kata7.smallEnoughBeginner;

import java.util.Arrays;

public class Kata {
    public static boolean smallEnough(int[] a, int limit)
    {
        return Arrays.stream(a).max().orElse(0)<=limit;
    }
}
