package kata7.simpleRemoveDuplicates;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{3,4,4,3,6,3})));
    }
    public static int[] solve(int[] arr) {
        List<Integer> list = new LinkedList<>();
        for (int i : arr) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}
