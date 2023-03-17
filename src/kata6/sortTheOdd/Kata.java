package kata6.sortTheOdd;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 1, 8, 0 })));
    }

    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i];
                if (array[i] > array[j] && array[i] % 2 != 0 && array[j] % 2 != 0) {
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
