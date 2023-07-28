package kata7.sumOfSequence;

import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(sequenceSum(16,15,3));
    }

    public static int sequenceSum(int start, int end, int step) {

        return IntStream.iterate(start,i->i<=end,i->i+step).sum();
    }
}
