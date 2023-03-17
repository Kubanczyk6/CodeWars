package kata7.regexpBasic;

import java.util.List;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isVowel("ba"));
    }
public static final List<String> vowelList = List.of("a","e","i","u","o");
    public static boolean isVowel(String s) {
        System.out.println(s);
        return s.matches("^[aeyiuoAEYIUO]+$")&&s.length()==1;
    }
}
