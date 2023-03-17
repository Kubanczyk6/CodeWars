package kata6.duplicateEncoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(duplicateCount("rEcede"));
    }

    private static String duplicateCount(String word) {
        char[] array = word.toCharArray();
        Map<String, Integer> map = new HashMap<>();

        for (char c : array) {
            Integer frequency = map.get(String.valueOf(c).toUpperCase());
            map.put(String.valueOf(c).toUpperCase(), frequency == null ? 1 : frequency + 1);
        }
        String result = "";
        for (char c : array) {
            if(map.get(String.valueOf(c).toUpperCase())>1){
                result+=")";
        }else{
                result+="(";
            }
        }
        return result;
    }
}
