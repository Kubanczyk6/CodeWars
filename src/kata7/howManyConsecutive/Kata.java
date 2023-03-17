package kata7.howManyConsecutive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(consecutive(new int[]{4,8,6}));
    }

    public static int consecutive(final int[] arr) {
return arr.length==0?0: (int) IntStream.rangeClosed(IntStream.of(arr).min().orElseThrow(),IntStream.of(arr).max().orElseThrow())
        .filter(i -> !IntStream.of(arr).boxed().toList().contains(i))
        .count();
    }
}
