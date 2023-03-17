package kata7.debugSumOfDigits;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1337));
    }

    public static int sumOfDigits(int n) {
return Stream.of(String.valueOf(n)
        .split(""))
        .mapToInt(Integer::parseInt)
        .sum();
    }
}
