package kata4.nextBiggerNumberWithTheSameDigits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(414));
    }

    public static long nextBiggerNumber(long n) {
        List<String> collect = Arrays.stream(String.valueOf(n)
                        .split(""))
                .collect(Collectors.toCollection(ArrayList::new));

        for (int i = collect.size() - 1; i > 0; i--) {
            if (Integer.parseInt(collect.get(i)) > Integer.parseInt(collect.get(i - 1))) {
                String temp = collect.get(i - 1);
                String and = collect.stream().skip(i)
                        .filter(s->Integer.parseInt(s)>Integer.parseInt(temp))
                        .sorted()
                        .distinct()
                        .findFirst()
                        .orElseThrow();
                String first = String.join("", collect).substring(0, i - 1);
                String second = collect.stream().skip(i - 1).sorted().collect(Collectors.joining());
                ArrayList<String> collect1 = Arrays.stream(new StringBuilder(second).reverse().toString().split(""))
                        .collect(Collectors.toCollection(ArrayList::new));
                collect1.remove(and);
                String second1 = collect1.stream().sorted().collect(Collectors.joining());
                return Long.parseLong(first + and + second1);
            }
        }
        return -1;
    }

}
