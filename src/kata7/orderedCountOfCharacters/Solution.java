package kata7.orderedCountOfCharacters;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(orderedCount("fxS229w3Fya2whngKb5ELZEIRXGPrjeCbmoKJShrxL"));
    }

    public static List<Pair<Character, Integer>> orderedCount(String text) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Integer frequency = map.get(text.charAt(i));
            map.put(text.charAt(i), frequency == null ? 1 : frequency + 1);
        }

        return map.entrySet().stream()
                .map(entry -> Pair.of(entry.getKey(), entry.getValue()))
                .toList();

    }
}
