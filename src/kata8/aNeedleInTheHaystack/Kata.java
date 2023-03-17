package kata8.aNeedleInTheHaystack;

import java.util.Arrays;

public class Kata {
    public static String findNeedle(Object[] haystack) {
        int index = 0;
        for (Object o : haystack) {
            if ("needle".equals(o)) {
                break;
            }
            index++;
        }
        return "found the needle at position " + index;
    }
}
