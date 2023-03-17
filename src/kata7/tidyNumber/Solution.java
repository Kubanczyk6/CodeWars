package kata7.tidyNumber;

public class Solution {
    public static void main(String[] args) {
        System.out.println(tidyNumber(143));
    }

    public static boolean tidyNumber(int number) {
        String toString = String.valueOf(number);
        for (int i = 0; i < toString.length() - 1; i++) {
            if (toString.charAt(i) > toString.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
