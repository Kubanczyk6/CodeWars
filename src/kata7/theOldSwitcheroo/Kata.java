package kata7.theOldSwitcheroo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(vowel2Index("this is my string"));
    }

    private static final List<Character> CHARACTER_LIST = List.of('u', 'i', 'o', 'a', 'e');

    public static String vowel2Index(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (CHARACTER_LIST.contains(s.charAt(i))) {
                result.append(i+1);
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
