package kata7.lookingforBenefactor;

import java.util.stream.DoubleStream;

public class NewAverage {
    public static void main(String[] args) {
        System.out.println(newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90));
    }

    private static long newAvg(double[] arr, double navg) {
        long ceil = (long) Math.ceil((navg * (arr.length + 1)) - DoubleStream.of(arr).sum());
        if (ceil <= 0) {
            throw new IllegalArgumentException();
        }

        return ceil;
    }
}
