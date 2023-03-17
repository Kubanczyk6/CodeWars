package kata6.equalSidesOfAnArray;

import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }

    private static int findEvenIndex(int[] arr) {
        int count = IntStream.of(arr).sum();
        int counter = 0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
            if (sum - i == (count - i) / 2) {
                return counter;
            }
            counter++;
        }
        return -1;
    }
}
