package kata7.arrayLeaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] ints = {16, 17, 4, 3, 5, 2};
        System.out.println(arrayLeaders(new int[]{16, 17, 4, 3, 5, 2, 0}));
        System.out.println(Arrays.stream(ints).skip(4).sum());
    }

    public static List arrayLeaders(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > Arrays.stream(numbers).skip(i + 1).sum()) {
                list.add(numbers[i]);
            }
        }
        return list;
    }
}
