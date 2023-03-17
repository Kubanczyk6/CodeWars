package kata7.betweenExtremes;

import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(betweenExtremes(new int[]{-1, -41, -77, -100}));
    }

    public static int betweenExtremes(int[] numbers)
    {
        return IntStream.of(numbers).max().orElseThrow()-IntStream.of(numbers).min().orElseThrow();
    }
}
