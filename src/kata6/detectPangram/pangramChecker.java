package kata6.detectPangram;

import java.util.HashMap;
import java.util.Map;

public class pangramChecker {
    public static void main(String[] args) {
        System.out.println(check("You shall not pass!"));
    }
    private static boolean check(String sentence){
        char[]array=sentence.toCharArray();
        Map<Character, Integer> map= new HashMap<>();
        for (char c : array) {
            Integer frequency = map.get(Character.toLowerCase(c));
            map.put(c, frequency == null ? 1 : frequency + 1);
        }
        return map.size() > 25;
    }
}
