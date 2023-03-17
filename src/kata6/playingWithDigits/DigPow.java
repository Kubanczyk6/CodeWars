package kata6.playingWithDigits;

public class DigPow {
    public static void main(String[] args) {
        System.out.println(digPow(92, 1));
    }
    private static long digPow(int n, int p) {
        String value = String.valueOf(n);
        String[] array = value.split("");
        int result = 0;

        for (String s : array) {
            result += Math.pow(Double.parseDouble(s), p);
            p++;
        }

        return result % n == 0 ? result / n : -1;
    }
}
