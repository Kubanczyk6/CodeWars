package kata7.factorial;

public class Factorial {
    public int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
