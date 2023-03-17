package kata6.deleteOccurenccess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class EnoughIsEnough {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 0)));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> list = new ArrayList<>();

        for (int element : elements) {
            list.add(element);
        }

        Collections.sort(list);
        int counter = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) == list.get(i)) {
                counter++;
            } else if (list.get(i - 1) != list.get(i)) {
                counter = 1;
            }
            if (counter > maxOccurrences) {
                list.remove(list.get(i));
                i--;
            }
        }
        int[] array = new int[list.size()];
        int index = 0;
        for (int element : elements) {
            for (int i = 0; i < list.size(); i++) {
                if (element == list.get(i)) {
                    array[index] = element;
                    list.remove(list.get(i));
                    index++;
                    break;
                }
            }

        }

        return maxOccurrences==0?new int[0]: array;

    }
}
