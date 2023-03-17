package kata7.dotCalculator;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(calc("..... // ."));
    }


    public static String calc(String txt) {
        System.out.println(txt);
        int first = (int) Arrays.stream(txt.split("")).takeWhile(s -> s.charAt(0) == '.').count();
        int second = (int) Arrays.stream(new StringBuilder(txt).reverse().toString().split("")).takeWhile(s -> s.charAt(0) == '.').count();

        String s1 = Arrays.stream(txt.split("")).dropWhile(s -> s.equals(".")).filter(s -> !" ".equals(s)).findFirst().orElseThrow();


        return switch (s1) {
            case "+" -> ".".repeat(first + second);
            case "*" -> ".".repeat(first * second);
            case "/" -> ".".repeat(first / second);
            case "-" -> ".".repeat(first - second);
            default -> "";
        };
    }
}
