package kata5.productOfConsecutiveFibNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProdFib {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(4895)));
    }

    private static long[] productFib(long prod) {
        long first = 0;
        long second = 1;
        List<Long> fibList = new LinkedList<>();

        for (int i = 0; ; i++) {
            if (i == 0) {
                fibList.add(first);
            } else if (i == 1) {
                fibList.add(second);
            } else {
                fibList.add(fibList.get(i - 2) + fibList.get(i - 1));
            }
            if (prod < fibList.get(i)) {
                break;
            }
        }

        long[] array = new long[3];
        for (int i = 1; i <= fibList.size(); i++) {
            if (fibList.get(i) * fibList.get(i - 1) == prod) {
                array[0] = fibList.get(i - 1);
                array[1] = fibList.get(i);
                array[2] = 1;
                break;
            } else if (fibList.get(i) * fibList.get(i - 1) > prod) {
                array[0] = fibList.get(i - 1);
                array[1] = fibList.get(i);
                array[2] = 0;
                break;
            }
        }
        return array;
    }
}
