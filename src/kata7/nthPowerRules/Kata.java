package kata7.nthPowerRules;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(modifiedSum(new int[] {1,2,3}, 3));
    }

    public static int modifiedSum(int[] array, int power) {
        return (int) (Arrays.stream(array).mapToDouble(i-> Math.pow(i,power)).sum()- IntStream.of(array).sum());
    }
}
