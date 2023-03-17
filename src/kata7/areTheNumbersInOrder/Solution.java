package kata7.areTheNumbersInOrder;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isAscOrder(new int[]{2,1}));
    }
    public static boolean isAscOrder(int[] arr) {
        int[] arrTMP = arr.clone();

        Arrays.sort(arrTMP);

        return Arrays.equals(arr, arrTMP);

    }
}
