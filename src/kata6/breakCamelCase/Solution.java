package kata6.breakCamelCase;

public class Solution {
    public static void main(String[] args) {
        System.out.println(camelCase("CamelCasingTest"));
    }

    public static String camelCase(String input) {
        String result = "";

        for (char a : input.toCharArray()) {
            if (Character.isLowerCase(a)) {
                result += a;
            } else {
                result += " " + a;
            }
        }
        return result;
    }
}
