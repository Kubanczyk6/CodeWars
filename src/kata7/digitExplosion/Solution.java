package kata7.digitExplosion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(explode("302"));
    }
    public static String explode(String digits) {
        return Arrays.stream(digits.split("")).map(i->i.repeat(Integer.parseInt(i))).collect(Collectors.joining());
    }
}
