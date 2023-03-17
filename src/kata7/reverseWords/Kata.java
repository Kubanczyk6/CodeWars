package kata7.reverseWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
        System.out.println(reverseWords("  abv  "));
        String join = String.join("", "   ");
        System.out.println(join.length());



    }

    private static String reverseWords(final String original) {
        return Arrays.stream(original.split("")).filter(i->i.contains(" ")).count()==original.length() ?original:
                Arrays.stream(original.split(" ")).
                map(i -> new StringBuilder(i).reverse()+" ")
                .collect(Collectors.joining()).trim();
    }
}
