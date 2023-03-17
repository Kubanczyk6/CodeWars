package kata7.balancedNumber;

public class Solution {
    public static void main(String[] args) {
        System.out.println(balancedNum(13));
    }
    public static String balancedNum(long number) {
        System.out.println(number);
        String a = String.valueOf(number);
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < a.length() / 2. - 1; i++) {
            firstSum += Integer.parseInt(Character.toString(a.charAt(i)));
            secondSum += Integer.parseInt(Character.toString(a.charAt(a.length() - 1 - i)));
        }
        return firstSum == secondSum ? "Balanced" : "Not Balanced";
    }
}
