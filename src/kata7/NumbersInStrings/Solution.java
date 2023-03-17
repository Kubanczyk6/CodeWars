package kata7.NumbersInStrings;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve("gh12cdy695m1"));
    }

    public static int solve(String s){
        System.out.println(Arrays.toString(s.split("[a-zA-Z]+")));
        return Stream.of(s.split("[a-zA-Z]+")).filter(i->i.length()>0).mapToInt(Integer::parseInt).max().orElse(0);
    }
}
