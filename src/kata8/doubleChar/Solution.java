package kata8.doubleChar;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
    }
    public static String doubleChar(String s){
        return Arrays.stream(s.split("")).map(i->i.repeat(2)).collect(Collectors.joining());
    }
}
