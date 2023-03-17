package kata7.flatAndSortAnArray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Kata {
    public static int[] flattenAndSort(int[][] array) {
        List<Integer> list = new LinkedList<>();

        for (int[] ints : array) {
            for (int anInt : ints) {
                list.add(anInt);
            }
        }


        int[] array1 = new int[list.size()];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = list.get(i);
        }
        Arrays.sort(array1);
        return array1;
    }


}

