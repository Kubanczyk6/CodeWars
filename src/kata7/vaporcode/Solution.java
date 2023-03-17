package kata7.vaporcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(vaporcode("Lets go to the movies"));
    }

    private static String vaporcode(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.replace(" ", "").toCharArray()) {
            result.append(Character.toUpperCase(c)).append("  ");
        }

        return result.toString().trim();
    }
}
