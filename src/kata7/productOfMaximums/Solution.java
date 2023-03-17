package kata7.productOfMaximums;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{10,8,7,9}, 3));
    }
    public static long maxProduct(int[] numbers, int sub_size)
    {
        Arrays.sort(numbers);
        long result=1;
        for (int i = 0; i < sub_size ; i++) {
            result*=numbers[numbers.length-1-i];
        }
        return result;
    }
}
