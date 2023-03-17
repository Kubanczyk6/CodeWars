package kata7.exesAndOhs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class X0 {
    public static void main(String[] args) {
        System.out.println(getX0("xxxXooOo"));
    }
    private static boolean getX0(String str) {

        char[] array = str.toLowerCase().toCharArray();
        int numX = 0;
        int numO = 0;
        for (char c : array) {
            if (c == 'x')
                numX++;
            if (c == 'o') {
                numO++;
            }
        }
        return numX == numO;
    }
}
