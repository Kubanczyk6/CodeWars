package kata7.consecutiveLetters;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve("dabc"));
    }

    public static boolean solve(String s){
        System.out.println(s);
       return IntStream.rangeClosed('a','z')
               .mapToObj(String::valueOf)
               .collect(Collectors.joining())
               .contains(Arrays.stream(s.split(""))
                       .sorted()
                       .mapToInt(s1->s1.charAt(0))
                       .mapToObj(String::valueOf)
                       .collect(Collectors.joining()));
    }
}
