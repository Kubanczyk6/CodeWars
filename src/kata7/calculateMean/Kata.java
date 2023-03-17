package kata7.calculateMean;

import java.util.Arrays;
import java.util.stream.Stream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mean(new char[] {'u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8', 'o', '2', '0'})));
    }

    public static Object[] mean(char[] lst) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : lst) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        double average =  sum / 10.;

        return new Object[]{average,sb.toString()};
    }
}
