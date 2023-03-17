package kata7.freatestCommonDivisor;

public class GCD {
    public static void main(String[] args) {
        System.out.println(compute(30,12));
    }
    public static int compute(int x, int y) {
        if (x > y) {
            int temp = y;
            y = x;
            x = temp;
        }

        for (int i = x; i > 1; i--) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
