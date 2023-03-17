package kata7.thePoetAndThePendulum;

import java.util.Arrays;

public class Poet {
    public static void main(String[] args) {
        pendulum(new int[]{8, 7, 10, 3});
    }

    public static int[] pendulum(final int[] values) {
        Arrays.sort(values);
        int[] resultArray = new int[values.length];
        int index = values.length % 2 == 0 ? values.length / 2 - 1 : values.length / 2;

        for (int i = 0, j = index, k = index + 1; i < values.length; i++) {
            if (i % 2 == 0) {
                resultArray[j] = values[i];
                j--;
            } else {
                resultArray[k] = values[i];
                k++;
            }
        }

        return resultArray;
    }
}
