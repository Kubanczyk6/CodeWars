package kata7.uniqueStringCharacters;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        System.out.println(solve("zhqyuiscwshlxa", "ebkrhxqvuyqludkmio"));
    }

    public static String solve(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (b.contains(String.valueOf(a.charAt(i)))) {
                b = b.replace(String.valueOf(a.charAt(i)), "");
                a = a.replace(String.valueOf(a.charAt(i)), "");
                i--;
            }
        }
        return a + b;
    }
}
