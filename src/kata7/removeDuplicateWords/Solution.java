package kata7.removeDuplicateWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static String removeDuplicateWords(String s){

        return Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));
    }
}
