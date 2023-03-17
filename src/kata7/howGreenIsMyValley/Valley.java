package kata7.howGreenIsMyValley;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Valley {
    public static void main(String[] args) {
        makeValley(new int[]{});
    }

    public static int[] makeValley(int[] arr) {
        if (arr.length == 0) {
            return new int[]{};
        }
        Arrays.sort(arr);
        int[] leftWing = new int[arr.length / 2];
        int[] rightWing = new int[arr.length % 2 == 0 ? arr.length / 2 - 1 : arr.length / 2];
        int counterLeftWing = 0;
        int counterRightWing = 0;
        for (int i = arr.length - 1, j = 0; i > 0; i--, j++) {
            if (j % 2 == 0) {
                leftWing[counterLeftWing] = arr[i];
                counterLeftWing++;
            } else {
                rightWing[counterRightWing] = arr[i];
                counterRightWing++;
            }
        }
        int[] resultArray = new int[arr.length];

        for (int i = 0, j = rightWing.length - 1; i < resultArray.length; i++) {
            if (i < leftWing.length) {
                resultArray[i] = leftWing[i];
            } else {
                if (i == leftWing.length) {
                    resultArray[i] = arr[0];
                } else {
                    resultArray[i] = rightWing[j];
                    j--;
                }

            }

        }
        return resultArray;
    }
}
