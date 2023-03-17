package kata7.largestElements;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(largest(2, new int[]{7, 6, 5, 4, 3, 2, 1})));
    }

    public static int[] largest(int n, int[] arr) {
        return IntStream.of(arr)
                .sorted()
                .skip(arr.length-n)
                .toArray();
    }
}
