package kata7.sumOfOddNumbers;

import java.util.Arrays;

public class RowSumOddNumbers {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(42));
    }

    public static int rowSumOddNumbers(int n) {
        int[] array = new int[n];


        int allNumbers = (1 + n) * n / 2;
        int last = 1 + 2 * (allNumbers - 1);
        ;
        for (int i = 0; i < n; i++) {
            array[i] = last;
            last -= 2;

        }
        return Arrays.stream(array).sum();
    }
}