package kata6.doesMyNumberLookBigInThis;

import java.util.Arrays;

public class NumberUtils {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(112));
    }

    public static boolean isNarcissistic(int number) {
        return Arrays.stream(String.valueOf(number)
                .split(""))
                .mapToDouble(s->Math.pow(Integer.parseInt(s),String.valueOf(number).length()))
                .sum()==number;

    }
}
