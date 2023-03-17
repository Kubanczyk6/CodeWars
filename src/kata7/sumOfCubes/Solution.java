package kata7.sumOfCubes;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumCubes(31966));
    }
    public static long sumCubes(long n) {
        System.out.println(n);
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long)Math.pow(i, 3);
        }
        return sum;
    }
}
