package kata7.arrayElementParity;

import java.util.Arrays;

public class Solution {
    public static int solve(int[] arr) {

        return Arrays.stream(arr).distinct().sum();
    }
}
