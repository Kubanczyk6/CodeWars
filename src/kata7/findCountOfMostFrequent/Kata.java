package kata7.findCountOfMostFrequent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static void main(String[] args) {
        System.out.println(mostFrequentItemCount(new int[]{-9, -14, 4, -7, 13, -4, -6, 7, 10, 13}));
    }

    public static int mostFrequentItemCount(int[] collection) {
        Arrays.sort(collection);
        int counter = 1;
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < collection.length; i++) {
            if (i < collection.length - 1 && collection[i] == collection[i + 1]) {
                counter++;
            } else {
                map.put(collection[i], counter);
                counter = 1;
            }
        }

        return collection.length == 1 ? 1 : map.values().stream().max(Comparator.comparingInt(i -> i)).orElse(0);
    }
}
