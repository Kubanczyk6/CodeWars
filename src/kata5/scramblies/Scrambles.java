package kata5.scramblies;

import java.util.HashMap;
import java.util.Map;

public class Scrambles {
    public static void main(String[] args) {
        System.out.println(scramble("katas","steak"));
    }

    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> mapStr1 = new HashMap<>();
        Map<Character, Integer> mapStr2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char temp = str1.charAt(i);
            Integer frequency = mapStr1.get(temp);
            mapStr1.put(temp, frequency == null ? 1 : frequency + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            char temp = str2.charAt(i);
            Integer frequency = mapStr2.get(temp);
            mapStr2.put(temp, frequency == null ? 1 : frequency + 1);
        }
        for (Character value : mapStr2.keySet()) {
            if (mapStr1.getOrDefault(value,0) < mapStr2.getOrDefault(value,0)) {
                return false;
            }
        }
        return true;
    }
}
