package kata7.NumbersWithThisDigitInside;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(NumbersWithDigitInside(5, 7)));
    }

    public static long[] NumbersWithDigitInside(long x, long d) {

        List<Long> allValidateNumbers = LongStream
                .rangeClosed(1, x)
                .filter(i -> String.valueOf(i)
                        .contains(String.valueOf(d)))
                .boxed()
                .toList();
        return new long[]{
                allValidateNumbers.size(),
                allValidateNumbers.stream().mapToLong(i -> i).filter(i -> String.valueOf(i).contains(String.valueOf(d))).sum(),
                allValidateNumbers.stream().filter(i -> String.valueOf(i).contains(String.valueOf(d)))
                        .reduce(allValidateNumbers.size() > 0 ? 1L : 0, (current, next) -> current * next)
        };
    }
}
