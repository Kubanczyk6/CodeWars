package kata7.extraPerfectNumbers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(extraPerfect(8)));
    }

    public static int[] extraPerfect(int number)
    {
        return IntStream.iterate(1,n->n<=number,n->n+2).toArray();
    }
}
