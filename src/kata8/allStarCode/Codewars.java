package kata8.allStarCode;

import java.util.Arrays;

public class Codewars {
    public static int strCount(String str, char letter) {
        return (int) Arrays.stream(str.split("")).filter(i->i.equals(Character.toString(letter))).count();
    }
}
