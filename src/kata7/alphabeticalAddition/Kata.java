package kata7.alphabeticalAddition;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(addLetters("s", "x", "s", "b", "j", "k", "h"));
    }

    public static String addLetters(String... letters) {
        System.out.println(Arrays.toString(letters));
        if (letters.length == 0) {
            return "z";
        }

        char start = 96;
        for (String letter : letters) {
            start += letter.charAt(0) - 96;
        }

        while (start > 122) {
            start -= 26;
        }


        return String.valueOf(start);
    }
}
