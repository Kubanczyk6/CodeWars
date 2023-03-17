package kata7.brokenSequence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BrokenSequence {
    public static void main(String[] args) {
        System.out.println(findMissingNumber("1 5"));
        Integer.parseInt("");
    }

    public static int findMissingNumber(String sequence) {
        System.out.println(sequence);
        String[] array = sequence.split(" ");
        try {
            Stream.of(array).forEach(Integer::parseInt);
        } catch (NumberFormatException e) {
            return sequence.length() == 0 ? 0 : 1;
        }
        List<Integer> integers = Arrays.stream(array).map(Integer::parseInt).sorted().toList();
        for (int i = 0; i < integers.size() - 1; i++) {
            if (integers.get(i) + 1 != integers.get(i + 1)) {
                return integers.get(i) + 1;
            }
        }
        return integers.get(0) != 1 ? 1 : 0;
    }
}
