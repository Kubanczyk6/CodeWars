package kata8.sumMixedArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MixedSum {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(9, 3, "7", "3")));
    }

    public static int sum(List<?> mixed) {
        int sum = 0;
        for (Object o : mixed) {
            if (o instanceof Integer) {
                Integer i = (Integer) o;
                sum += i;
            }
            if (o instanceof String) {
                String s = (String) o;
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }
}
