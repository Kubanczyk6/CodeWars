package kata7.maxminArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{15,11,10,7,12})));
    }

    public static int[] solve(int[] arr) {

        int[] resultArray = new int[arr.length];
        int counter = 0;
        for (int i = 0; counter < arr.length; i++) {
            int i1 = Arrays.stream(arr).sorted().limit(arr.length - i).max().orElseThrow();
            int i2 = Arrays.stream(arr).sorted().skip(i).min().orElseThrow();
            resultArray[counter] = i1;
            if(counter+1<arr.length)  resultArray[counter + 1] = i2;
            counter += 2;
        }
        return resultArray;
    }


    static class Pair {
        final int max;
        final int min;

        public Pair(int max, int min) {
            this.max = max;
            this.min = min;
        }
    }
}
