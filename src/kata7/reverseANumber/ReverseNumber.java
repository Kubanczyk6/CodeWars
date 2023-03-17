package kata7.reverseANumber;

public class ReverseNumber {
    public static int reverse(int number) {

        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(number)));
        String result = number < 0 ? "-" + sb.reverse() : sb.reverse().toString();
        return Integer.parseInt(result);
    }
}
