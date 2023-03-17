package kata7.isNDivisibleByN;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Divisible {
    public static void main(String[] args) {
        System.out.println(isDivisible(12, 3,4));
    }

    public static boolean isDivisible(int... args) {
        System.out.println(Arrays.toString(args));
        return Arrays.stream(args).skip(1).filter(i -> args[0] % i == 0).count() == args.length-1;
    }
}
