package kata7.excalamationMarks;

import java.util.Arrays;
import java.util.stream.Collectors;

public class R {
    public static void main(String[] args) {
        System.out.println(removeBang("!!!Hi !!hi!!! !hi"));
    }

    public static String removeBang(String str) {
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            String collect = Arrays.stream(new StringBuilder(s[i]).reverse().toString().split(""))
                    .dropWhile("!"::equals)
                    .collect(Collectors.joining());
            s[i]=new StringBuilder(collect).reverse().toString();
        }

        return String.join(" ",s);
    }
}
