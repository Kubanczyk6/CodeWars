package kata7.oddOrEven;

import java.util.Arrays;

public class Codewars {
    private static String oddOrEven(int[]array){
        return Arrays.stream(array).sum()%2==0?"even":"odd";
    }
}
