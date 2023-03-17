package kata7.rowWeights;

import java.util.Arrays;

public class Solution {
    public static int[] rowWeights(final int[] weights) {
        int first = 0;
        int second = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                first += weights[i];
            } else {
                second += weights[i];
            }
        }
        return new int[]{first, second}; // Do your magic!
    }
}
