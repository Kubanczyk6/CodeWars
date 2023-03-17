package kata7.maximumGap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxGap(new int[]{24,299,131,14,26,25}));
    }

    public static int maxGap(int[] numbers) {
        Arrays.sort(numbers);
        int result = 0;
        for (int i = 1; i < numbers.length; i++) {
            int difference = numbers[i] - numbers[i-1];
            result = Math.max(result, difference);
        }
        return result;
    }
}
