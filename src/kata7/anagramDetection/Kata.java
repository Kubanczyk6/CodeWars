package kata7.anagramDetection;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static void main(String[] args) {
        System.out.println(isAnagram("apple", "pale"));
    }

    public static boolean isAnagram(String test, String original) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        test = test.toLowerCase();
        original = original.toLowerCase();
        for (int i = 0; i < test.length(); i++) {
            Integer frequency = map.get(test.charAt(i));
            map.put(test.charAt(i), frequency == null ? 1 : frequency + 1);
        }
        for (int i = 0; i < original.length(); i++) {
            Integer frequency = map1.get(original.charAt(i));
            map1.put(original.charAt(i), frequency == null ? 1 : frequency + 1);
        }

        return map.equals(map1);


    }
}
