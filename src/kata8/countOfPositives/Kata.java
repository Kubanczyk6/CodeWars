package kata8.countOfPositives;

import java.util.Arrays;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        return input==null||input.length==0?new int[0]
                : new int[]{(int)Arrays.stream(input).filter(i->i>0).count(), Arrays.stream(input).filter(i->i<0).sum()};
    }
}
