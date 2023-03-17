package kata7.sortOutTheMenFromBoys;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(menFromBoys(new int[]{49,818,-282,900,928,281,-282,-1})));
    }

    public static int[] menFromBoys(final int[] values) {
        int[] ints = Arrays.stream(values).distinct().sorted().toArray();
        int[] array = new int[ints.length];
        for (int i = 0, index = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                array[index] = ints[i];
                index++;
            } else {
                array[index - i + ints.length - 1] = ints[i];
            }
        }
        return array;
    }
}
