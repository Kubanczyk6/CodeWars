package kata7.twoToOne;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    private static String longest(String s1, String s2) {
        char[] strings = (s1 + s2).toCharArray();
        Arrays.sort(strings);

        String result = "";
        for (char string : strings) {
            if (!result.contains(String.valueOf(string))) {
                result += string;
            }
        }
        return result;

    }
}
