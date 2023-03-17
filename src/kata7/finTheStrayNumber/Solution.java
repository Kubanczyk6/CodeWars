package kata7.finTheStrayNumber;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(stray(new int[]{1, 1, 2}));
    }
    static int stray(int[] numbers) {
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[0] != numbers[1]) {
                return numbers[0];
            }
        }
        return numbers[numbers.length - 1];
    }}
