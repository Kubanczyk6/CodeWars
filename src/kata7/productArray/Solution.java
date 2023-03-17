package kata7.productArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productArray(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20})));
    }

    public static long[] productArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
        long[] resultArray = new long[numbers.length];

        for (int i = 0; i < resultArray.length; i++) {
            long multiply = 1;
            for (int j = 0; j < numbers.length; j++) {
                multiply = multiply * numbers[j];
            }
            resultArray[i] = multiply / numbers[i];
        }
        return resultArray;
    }
}
