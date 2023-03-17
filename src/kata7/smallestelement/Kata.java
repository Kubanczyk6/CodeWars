package kata7.smallestelement;

import java.util.Arrays;

public class Kata {
    public static int nthSmallest(final int[] arr, final int n) {
        Arrays.sort(arr);
        return arr[n-1];
    }
}
