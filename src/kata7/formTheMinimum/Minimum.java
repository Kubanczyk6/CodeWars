package kata7.formTheMinimum;

import java.util.Arrays;

public class Minimum {
    public static int minValue(int[] values) {
        int[] ints = Arrays.stream(values).distinct().toArray();
        Arrays.sort(ints);
        String result = "";
        for (int anInt : ints) {
            result += anInt;
        }
        return Integer.parseInt(result);
    }}
