package kata7.splitInParts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InParts {
    public static void main(String[] args) {
        System.out.println(splitInParts("supercalifragilisticexpialidocious",3));
    }

    public static String splitInParts(String s, int partLength) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % partLength == 0) {
                result = result + " " + s.charAt(i);
            } else {
                result += s.charAt(i);
            }
        }

        return result.trim();
    }
}
