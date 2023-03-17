package kata7.maximumTripletSum;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxTriSum(new int[]{3, 2, 6, 8, 2, 3}));
    }
    public static int maxTriSum(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
        int[] ints = Arrays.stream(numbers).distinct().sorted().toArray();
        return ints[ints.length-1] + ints[ints.length-2] + ints[ints.length-3];
    }
}
