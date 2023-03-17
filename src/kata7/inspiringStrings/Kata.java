package kata7.inspiringStrings;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Kata {

    public static void main(String[] args) {
        System.out.println(longestWord("one grey blue"));
    }

    public static String longestWord(String wordString) {
        TreeMap<Integer, List<String>> groupingByStringLength = Arrays.stream(wordString.split(" "))
                .collect(Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()));

        List<String> longestWords = groupingByStringLength.lastEntry().getValue();

       return longestWords.get(longestWords.size()-1);

    }
}
