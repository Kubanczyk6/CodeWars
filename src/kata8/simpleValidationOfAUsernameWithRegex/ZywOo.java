package kata8.simpleValidationOfAUsernameWithRegex;

import java.util.Arrays;

public class ZywOo {
    public static void main(String[] args) {
        System.out.println(validateUsr(""));
    }

    public static boolean validateUsr(String s) {
        System.out.println(s);

        return s.length() > 3 && s.length() < 17 && Arrays.stream(s.split("")).filter(i -> "_".equals(i) || Character.isDigit(i.charAt(0)) || Character.isLowerCase(i.charAt(0))).count() == s.length();
    }
}
