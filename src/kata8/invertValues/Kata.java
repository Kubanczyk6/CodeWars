package kata8.invertValues;

import java.util.Arrays;

public class Kata {
    public static int[] invert(int[] array) {

        return Arrays.stream(array).map(i -> -i).toArray();
    }
}
