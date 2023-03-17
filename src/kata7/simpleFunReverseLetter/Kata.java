package kata7.simpleFunReverseLetter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static String reverseLetter(final String str) {
        String collect = Arrays.stream(str.split("")).filter(i -> Character.isAlphabetic(i.charAt(0))).collect(Collectors.joining());
        return new StringBuilder(collect).reverse().toString(); //coding and coding..
    }
}
