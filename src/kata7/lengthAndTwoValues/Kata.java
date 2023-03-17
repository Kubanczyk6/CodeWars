package kata7.lengthAndTwoValues;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(alternate(5, "true", "false")));
    }

    public static String[] alternate(int n, String firstValue, String secondValue) {
        return IntStream.rangeClosed(1,n)
                .mapToObj(i->i%2!=0?firstValue:secondValue)
                .toArray(String[]::new);
    }
}
