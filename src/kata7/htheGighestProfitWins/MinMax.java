package kata7.htheGighestProfitWins;

import java.util.Arrays;

public class MinMax {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{})));
    }
    private static int[] minMax(int[]arr){
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        return new int[]{min, max};

    }
}
