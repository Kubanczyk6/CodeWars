package kata7.alternateCase;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    static String alternateCase(final String string) {
        StringBuilder result = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();

    }
}
