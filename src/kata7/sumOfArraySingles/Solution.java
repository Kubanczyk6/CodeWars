package kata7.sumOfArraySingles;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(repeats(new int[]{9, 10, 19, 13, 19, 13}));
    }

    public static int repeats(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 && arr[i - 1] != arr[i]) {
                sum += arr[i];
            } else if (i == 0 && arr[i + 1] != arr[i]) {
                sum += arr[i];
            } else if (i > 0 && i < arr.length - 1 && arr[i - 1] != arr[i] && arr[i] != arr[i + 1]) {
                sum += arr[i];
            }
        }

        return sum;
    }
}
