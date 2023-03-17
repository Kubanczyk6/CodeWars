package kata7.basicSequencePractise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SequenceSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfN(-4)));
    }

    public static int[] sumOfN(int n) {
        int[] array = new int[Math.abs(n) + 1];
        int counter = 0;
        for (int i = 1; i <= Math.abs(n); i++) {
            counter++;
            array[i] = array[i - 1] + counter;
        }
        return n > 0 ? array : IntStream.of(array).map(i -> -i).toArray();
    }
}
