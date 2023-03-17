package kata8.toSquare;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[]{100, 101, 5, 5, 1, 1})));
    }

    public static int[] squareOrSquareRoot(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                arr[i] = (int) Math.sqrt(array[i]);
            } else {
                arr[i] = array[i] * array[i];
            }
        }

        return arr;
    }
}
