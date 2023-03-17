package kata7.doubleSort;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class DoubleSort {
    public static void main(String[] args) {
    }

    public static Object[] dbSort(Object[] a) {
        List<? super Object> integerList = new ArrayList<>();
        List<? super Object> stringList = new ArrayList<>();

        for (Object o : a) {
            if (o instanceof Integer) {
                integerList.add(o);
            }
            if (o instanceof String) {
                stringList.add(o);
            }
        }

        integerList.sort(Comparator.comparingInt(i -> (int) i));
        stringList.sort(Comparator.comparing(s -> (String) s));
        integerList.addAll(stringList);
        return integerList.toArray();
    }
}
