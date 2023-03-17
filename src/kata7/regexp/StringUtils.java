package kata7.regexp;

public class StringUtils {

    public static boolean isLetter(String s) {
       return s.length()==1&&Character.isLetter(s.charAt(0));
    }
}
