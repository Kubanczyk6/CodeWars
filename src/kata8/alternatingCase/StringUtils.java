package kata8.alternatingCase;

public class StringUtils {

    public static String toAlternativeString(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                result.append(Character.toUpperCase(string.charAt(i)));
            } else {
                result.append(Character.toLowerCase(string.charAt(i)));
            }
        }
        return result.toString();
    }
}
