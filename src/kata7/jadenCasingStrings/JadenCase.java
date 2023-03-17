package kata7.jadenCasingStrings;

import java.util.Arrays;
import java.util.stream.Stream;

public class JadenCase {
    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
    }

    private static String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        }
        String[] array = phrase.split(" ");
        int i = 0;
        for (String s : array) {
            array[i] = s.replace(s.charAt(0), Character.toUpperCase(s.charAt(0)));
            i++;
        }

        StringBuilder result = new StringBuilder();
        for (String s : array) {
            result.append(s).append(" ");
        }

        return result.toString().trim();
    }
}
