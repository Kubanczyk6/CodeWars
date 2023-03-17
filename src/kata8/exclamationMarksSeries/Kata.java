package kata8.exclamationMarksSeries;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(remove("!!!Hi !!hi!!! !hi", 1));
    }

    public static String remove(String s, int n) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '!' && n > 0) {
                s = s.replaceFirst("!", "");
                n--;
                i--;
            }
        }
        return s;

    }
}
