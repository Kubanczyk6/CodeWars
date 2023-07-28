package kata7.thinkingTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(testit(new int[] { 1, 2, 1 },new int[] { 2, 1, 2 })));
    }

    public static int[] testit(int[] a, int[] b){
        List<Integer> uniqueInFirstArray = new ArrayList<>(IntStream.of(a).distinct().boxed().toList());
        List<Integer> uniqueInSecondArray = IntStream.of(b).distinct().boxed().toList();
        uniqueInFirstArray.addAll(uniqueInSecondArray);

        return uniqueInFirstArray.stream().sorted().mapToInt(i->i).toArray();
    }
}
