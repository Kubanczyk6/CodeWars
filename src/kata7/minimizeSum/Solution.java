package kata7.minimizeSum;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {5, 4, 2, 3};
        System.out.println(minSum(array));

    }

    public static int minSum(int[] passed) {
        Arrays.sort(passed);
        int sum = 0;
        for (int i = 0; i < passed.length / 2; i++) {
            sum += passed[i] * passed[passed.length - 1 - i];
        }
        return sum;
    }
}
