package kata6.camelCaseMethod;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String a = " ";
        String b = " ";
        System.out.println(camelCase("pjq   pbwjplfe b"));
    }
    public static String camelCase(String str) {
        System.out.println(str);


        return Arrays.stream(str.trim().split(" "))
                .filter(i->!"".equals(i))
                .map(i->Character.toUpperCase(i.charAt(0))+i.substring(1))
                .collect(Collectors.joining());
    }
}
