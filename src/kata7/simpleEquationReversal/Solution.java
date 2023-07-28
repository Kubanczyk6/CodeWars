package kata7.simpleEquationReversal;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve("a*b/c+50"));
    }

    public static String solve(String eq) {
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < eq.length(); i++) {
            if (Character.isDigit(eq.charAt(i))) {
                sb.append(eq.charAt(i));
                if (i == eq.length() - 1) {
                    result.append(sb.reverse());
                }
            } else {
                result.append(sb.reverse()).append(eq.charAt(i));
                sb = new StringBuilder();
            }
        }

        return result.reverse().toString();
    }
}
