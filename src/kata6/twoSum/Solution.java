package kata6.twoSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1234, 5678, 9012}, 14690)));
    }

    public static int[] twoSum(int[] numbers, int target) {


        int first = 0;
        int second = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    first = i;
                    second = j;
                    break;
                }
            }
        }
        return new int[]{first, second};
    }
}
