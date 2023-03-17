package kata8.wordValues;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nameValue(new String[]{"abc", "abc abc"})));
    }

    public static int[] nameValue(String[] arr) {

        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int value = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == ' ') {
                    continue;
                }
                value += arr[i].charAt(j) - 96;
            }
            array[i] = value * (i + 1);
        }

        return array;
    }
}
