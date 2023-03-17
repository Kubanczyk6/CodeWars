package kata7.returnTheFirstMMultiplesOfN;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiples(3,5)));
    }

    public static int[] multiples(int m, int n) {
        return IntStream.rangeClosed(1,m).map(i->i*n).toArray();
    }
}
