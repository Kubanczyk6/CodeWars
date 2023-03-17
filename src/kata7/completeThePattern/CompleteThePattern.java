package kata7.completeThePattern;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompleteThePattern {
    public static void main(String[] args) {
        System.out.println(pattern(11));
    }

    public static String pattern(int n) {
        StringBuilder result = new StringBuilder();
        int counter = n;
        while (counter > 0) {
            String collect = IntStream.iterate(n, n2 -> n2 - 1).limit(counter).mapToObj(String::valueOf).collect(Collectors.joining());
            result.append(collect).append("\n");
            counter--;

        }
        return result.toString().trim();
    }
}
