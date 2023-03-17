package kata7.curryingFunctions;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
    public static void main(String[] args) {
        Integer[] apply =  multiplyAll(new int[]{1, 2, 3}).apply(2);
        System.out.println(apply.length);
        System.out.println(Arrays.toString(apply));
    }
    public static Function<Integer,Integer[]> multiplyAll(int[] array) {
        return elem-> {
            Integer[] array1 = new Integer[array.length];
            for (int i = 0; i < array.length; i++) {
                array1[i]=array[i]* elem;
            }
            return array1;
        };
    }
}
