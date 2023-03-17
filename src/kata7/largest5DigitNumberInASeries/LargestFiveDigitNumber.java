package kata7.largest5DigitNumberInASeries;

public class LargestFiveDigitNumber {
    public static void main(String[] args) {
        System.out.println(solve("1234567890"));
    }
    public static int solve(final String digits) {
        String max = "";
        int maxValue = 0;
        for (int i = 0; i < digits.length(); i++) {
            max += digits.charAt(i);
            if (max.length() > 5) {
                max = max.replaceFirst(String.valueOf(max.charAt(0)), "");
            }
            maxValue = Math.max(maxValue, Integer.parseInt(max));
        }
        return maxValue;
    }
}
