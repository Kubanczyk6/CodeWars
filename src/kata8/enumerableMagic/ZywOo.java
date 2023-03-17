package kata8.enumerableMagic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ZywOo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(take(new int[]{5, 1, 6, 3, 5, 8, 13}, 3)));
    }

    public static int[] take(int[] arr, int n) {
        System.out.println(Arrays.toString(arr));
        System.out.println(n);
        int[] array = new int[Math.min(arr.length, n)];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
        }
        return array;
    }
}
