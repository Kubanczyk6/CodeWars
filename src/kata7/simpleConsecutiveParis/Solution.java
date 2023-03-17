package kata7.simpleConsecutiveParis;

public class Solution {
    public static int solve(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0 && Math.abs(arr[i + 1] - arr[i]) == 1) {
                counter++;
            }
        }
        return counter;
    }
}
