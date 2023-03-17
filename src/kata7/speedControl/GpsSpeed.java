package kata7.speedControl;

import java.util.Arrays;

public class GpsSpeed {
    public static void main(String[] args) {
        System.out.println(gps(20, new double[] {0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61}));
    }
    public static int gps(int s, double[] x) {

        int max = 0;

        for (int i = 0; i < x.length - 1; i++) {
            int result = (int) (3600 * (x[i + 1] - x[i]) / s);
            max = Math.max(result, max);
        }

        return max;
    }
}
