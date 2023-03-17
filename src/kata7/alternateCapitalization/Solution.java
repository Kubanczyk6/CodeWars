package kata7.alternateCapitalization;

public class Solution {
    public static String[] capitalize(String s) {
        String string1 = "";
        String string2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                string1 += Character.toUpperCase(s.charAt(i));
                string2 += Character.toLowerCase(s.charAt(i));
            } else {
                string1 += Character.toLowerCase(s.charAt(i));
                string2 += Character.toUpperCase(s.charAt(i));
            }
        }
        return new String[]{string1, string2};
    }
}
