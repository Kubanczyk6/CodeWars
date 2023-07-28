package kata5.greedIsGood;

import java.util.*;

public class Greed {
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{3, 3, 3, 1, 2}));
    }

    public static final List<Integer> points = List.of(1000, 200, 300, 400, 500, 600, 100, 50);

    public static int greedy(int[] dice) {
        System.out.println(Arrays.toString(dice));
        Map<Integer, Integer> map = new TreeMap<>();
        for (int die : dice) {
            Integer frequency = map.get(die);
            map.put(die, frequency == null ? 1 : frequency + 1);
        }
        int result = 0;
        map.forEach((k, v) -> System.out.println("k: " + k + " v: " + v));
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            Integer frequency = integerIntegerEntry.getValue();
            if (frequency >= 3) {
                result += points.get(integerIntegerEntry.getKey() - 1);
                if (integerIntegerEntry.getKey() == 1) {
                    result += 100 * (integerIntegerEntry.getValue() - 3);
                }
                if (integerIntegerEntry.getKey() == 5) {
                    result += 50 * (integerIntegerEntry.getValue() - 3);
                }
            } else {
                if (integerIntegerEntry.getKey() == 1) {
                    result += 100 * integerIntegerEntry.getValue();
                }
                if (integerIntegerEntry.getKey() == 5) {
                    result += 50 * integerIntegerEntry.getValue();
                }
            }
        }

        return result;
    }
}
