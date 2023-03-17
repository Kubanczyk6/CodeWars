package kata7.jumpingNumbers;

public class Solution {
    public static void main(String[] args) {
        System.out.println(jumpingNumber(543456));
    }

    public static String jumpingNumber(int number) {
        if (number < 10) {
            return "Jumping!!";
        }
        String stringNumber = String.valueOf(number);

        for (int i = 0; i < stringNumber.length() - 1; i++) {
            if (checkTheAdjacentDigitsInInDifferBy1(stringNumber, i)) {
                return "Not!!";
            }
        }

        return "Jumping!!";
    }

    private static boolean checkTheAdjacentDigitsInInDifferBy1(String stringNumber, int i) {
        return Math.abs(Integer.parseInt(String.valueOf(stringNumber.charAt(i))) - Integer.parseInt(String.valueOf(stringNumber.charAt(i + 1)))) != 1;
    }
}
