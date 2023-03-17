package kata7.showMultiplesOf2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        findMultiples(2,4,40);
    }

    public static List<Integer> findMultiples(int s1, int s2, int s3) {

      return IntStream.rangeClosed(s1, s3).filter(i -> i % s1 == 0 && i % s2 == 0 && i < s3).boxed().toList();
    }
}
