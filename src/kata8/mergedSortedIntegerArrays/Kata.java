package kata8.mergedSortedIntegerArrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 })));
    }
    public static int[] mergeArrays(int[] first, int[] second) {
        return Stream.concat(Arrays.stream(first).boxed(),Arrays.stream(second).boxed())
                .sorted()
                .distinct()
                .mapToInt(i->i)
                .toArray();

    }
}
