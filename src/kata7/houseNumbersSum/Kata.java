package kata7.houseNumbersSum;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(houseNumbersSum(new int[]{5, 1, 2, 3, 0, 1, 5, 0, 2}));
    }

    public static int houseNumbersSum(final int[] arr) {

        int sum = 0;

        for (int i : arr) {
            if (i == 0) {
                return sum;
            }
            sum += i;
        }

        return sum;
    }
}
