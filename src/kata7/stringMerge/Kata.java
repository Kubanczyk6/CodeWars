package kata7.stringMerge;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(stringMerge("coding", "anywhere", 'n'));
    }


    public static String stringMerge(String s1, String s2, char letter) {
        String firstString = Stream.of(s1.split(""))
                .takeWhile(c -> !c.equals(String.valueOf(letter)))
                .collect(Collectors.joining());
        String secondString = Stream.of(s2.split(""))
                .dropWhile(c -> !c.equals(String.valueOf(letter)))
                .collect(Collectors.joining());

        return firstString+secondString;
    }
}
