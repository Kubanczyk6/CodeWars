package kata6.findTheParity;

import java.util.Arrays;

public class FindOutlier {
    public static void main(String[] args) {
        System.out.println(find(new int[]{7, 10, 15, 17}));
    }

    private static int find(int[] integers) {
        int evenNumbers = 0;
        for (int integer : integers) {
            if (integer % 2 == 0) {
                evenNumbers++;
            }
        }

        int result = Integer.MIN_VALUE;

        for (int integer : integers) {
            if (evenNumbers == 1) {
                if (integer % 2 == 0) {
                    result = integer;
                }
            } else if (integer % 2 != 0) {
                result = integer;
            }
        }
        return result;
    }
}
