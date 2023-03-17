import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class anagram {
    public static void main(String[] args) {
        System.out.println(getAnagram("rwsodwera", "dwersorw"));
        System.out.println(getAnagram1("rwsodwera", "dwersorw"));
    }

    private static boolean getAnagram(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char temp = s1.charAt(i);
            Integer frequency = map1.get(temp);
            map1.put(s1.charAt(i), frequency == null ? 1 : frequency + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char temp = s2.charAt(i);
            Integer frequency = map2.get(temp);
            map2.put(s2.charAt(i), frequency == null ? 1 : frequency + 1);
        }
        return map1.equals(map2);
    }

    private static boolean getAnagram1(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
