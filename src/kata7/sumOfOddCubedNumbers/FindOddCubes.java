package kata7.sumOfOddCubedNumbers;

import java.util.Arrays;

public class FindOddCubes {
    public static void main(String[] args) {
        System.out.println(cubeOdd(new int[]{17, -5, 44, 15}));
    }

    public static int cubeOdd(int arr[]) {
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += (int) Math.pow(arr[i], 3);
            }
        }

        return sum;
    }
}
