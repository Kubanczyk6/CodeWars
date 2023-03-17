package kata6.arrayDiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1,2,2, 4,3}, new int[]{2, 1})));
    }

    private static int[] arrayDiff(int[] a, int[] b) {
        int counter = 0;

        for (int i : a) {
            for (int i1 : b) {
                if (i == i1) {
                    counter++;
                    break;
                }
            }
        }
        int[] array = new int[a.length - counter];
        int x = 0;
        int y = 0;
        for (int i : a) {
            for (int i1 : b) {
                x++;
                if (i == i1) {
                    x = 0;
                    break;
                }
                if (x == b.length) {
                    array[y] = i;
                    y++;
                    x=0;
                }
            }
        }
        return b.length==0?a:array;

    }
}
