package kata8.multipleOfIndex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ZywOo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{22, -6, 32, 82, 9, 25})));
    }
    public static int[] multipleOfIndex(int[] array) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                list.add(array[i]);
            }
        }
        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
