package kata7.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static long fib(int n) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1));
        for (int i = 2; i < n; i++) {
            int add = list.get(i - 2) + list.get(i - 1);
            list.add(add);
        }

        return n == 1 || n == 2 ? 1 : list.get(list.size() - 1);

    }
}
