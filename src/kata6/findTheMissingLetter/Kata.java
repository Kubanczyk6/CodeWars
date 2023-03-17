package kata6.findTheMissingLetter;

import java.util.Arrays;
import java.util.stream.Stream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
    }

    public static char findMissingLetter(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 2 == array[i + 1]) {
                return (char) (array[i] + 1);
            }
        }
        return 'a';
    }
}
