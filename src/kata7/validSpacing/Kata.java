package kata7.validSpacing;

import java.util.stream.Stream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(validSpacing("codewars"));
    }

    public static boolean validSpacing(String s) {

        return Stream.of(s.split(" ")).noneMatch(""::equals)
                &&s.trim().length()==s.length()
                || s.length()==0;
    }
}
