package kata7.scrollingText;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(scrollingText("codewars")));
    }

    public static String[] scrollingText(String text) {
        String[] array = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            String s = text.substring(i) + text.substring(0, i);
            array[i] = s.toUpperCase();
        }
        return array;
    }
}
