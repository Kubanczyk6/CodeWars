package kata7.seriesOfIntegersFromMToN;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {

    public static void main(String[] args) {

        long before = System.currentTimeMillis();
        generateIntegers(1,1000000000);
        long after = System.currentTimeMillis();
        System.out.println(after-before);

    }

    public static int[] generateIntegers(final int m, final int n) {
        return IntStream.rangeClosed(m,n).toArray();
    }


}
