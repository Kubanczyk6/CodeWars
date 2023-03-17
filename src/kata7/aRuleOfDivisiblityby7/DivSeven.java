package kata7.aRuleOfDivisiblityby7;

import java.util.Arrays;

public class DivSeven {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seven(100)));
    }

    public static long[] seven(long m) {
        System.out.println(m);
        int counter = 0;
        while (m >= 100) {
            m = m / 10 - 2 * (m % 10);
            counter++;
        }

        return new long[]{m, counter};
    }
}
