package kata7.alphabetSymmetry;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new String[]{"abode","ABc","xyzD"})));
    }
    public static int[] solve(String[] arr) {

        int[] array = new int[arr.length];
        int index = 0;
        for (String s : arr) {
            char start = 97;
            int counter = 0;
            for (char s1 : s.toLowerCase().toCharArray()) {
                if (s1 == start) {
                    counter++;
                }
                start++;
            }
            array[index] = counter;
            index++;
        }
        return array;

    }
}
