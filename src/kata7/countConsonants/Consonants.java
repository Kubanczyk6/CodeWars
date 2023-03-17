package kata7.countConsonants;

import java.util.Arrays;
import java.util.List;

public class Consonants {
    public static final List<String> list = List.of("a", "e", "i", "o", "u");


    public static int getCount(String str) {
        return (int) Arrays.stream(str.split(""))
                .filter(s -> s.length() > 0 && Character.isLetter(s.charAt(0)) && !list.contains(s))
                .count();
    }
}
