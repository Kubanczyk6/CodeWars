package kata7.IsItNegative0;

public class NegativeZeroValidator {
    public static void main(String[] args) {
        System.out.println(isNegativeZero(-0f));
    }


    public static boolean isNegativeZero(float n) {
        System.out.println(n);
        return "-0f".equals(String.valueOf(n));
    }
}
