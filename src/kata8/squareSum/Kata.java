package kata8.squareSum;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {}));
    }
    public static int squareSum(int[] n)
    {
       return Arrays.stream(n).map(i->(int)Math.pow(i, 2)).sum();
    }
}
