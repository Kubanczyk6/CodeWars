package kata7.listFiltering;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
    }

    private static List<Object> filterList(final List<Object> list) {
        List<Object> list1 = new LinkedList<>();
        for (Object o : list) {
            try {
                int a = (int) o;
                list1.add(o);
            } catch (Exception e) {

            }
        }
        return list1;
    }
}
