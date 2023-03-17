package kata7.automorphicNumber;

public class Solution {
    public static void main(String[] args) {
        System.out.println(autoMorphic(95));
    }

    public static String autoMorphic(int number) {
        System.out.println(number);

        long result = (long) number * number;

        StringBuilder sb = new StringBuilder(String.valueOf(result));
        boolean isValid = true;
        for (int i = sb.length() - String.valueOf(number).length(), j = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != String.valueOf(number).charAt(j)) {
                isValid = false;
                break;
            }
            j++;
        }

        return isValid ? "Automorphic" : "Not!!";
    }
}
