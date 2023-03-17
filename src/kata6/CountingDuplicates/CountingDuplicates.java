package kata6.CountingDuplicates;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("ABBAABB"));
    }

    private static int duplicateCount(String text) {
        char[] array = text.toCharArray();
        Map<String, Integer> map = new HashMap<>();

        for (char c : array) {
            Integer frequency = map.get(String.valueOf(c).toUpperCase());
            map.put(String.valueOf(c).toUpperCase(), frequency == null ? 1 : frequency + 1);
        }
        int result = 0;
        for (Integer value : map.values()) {
            if (value > 1) {
                result++;
            }
        }
        return result;
    }
}
