package kata7.stantonMeasure;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[] {1, 4, 3, 2, 1, 2, 3, 2}));
    }

    public static int stantonMeasure(int[] arr) {
        long countOneOccurred = Arrays.stream(arr).filter(i -> i == 1).count();
        return (int) Arrays.stream(arr).filter(i -> i == countOneOccurred).count();

    }
}
