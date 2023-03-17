package kata6.tribonacciSequence;

public class Xbinacci {
    private static double[] tribonacci(double[] s, int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                array[i] = s[i];
            } else {
                array[i] = array[i - 1] + array[i - 2] + array[i - 3];
            }
        }
        return array;
    }
}
