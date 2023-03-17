package kata7.mostDigits;

import java.util.Arrays;

public class MostDigits {
    public static void main(String[] args) {
        int a = 103866671;
        System.out.println(a);
    }

    public static int findLongest(int[] numbers) {
        System.out.println(Arrays.toString(numbers));

        int length = 0;
        int result = 0;
        for (int number : numbers) {
            if (number >= 0) {
                if (String.valueOf(number).length() > length) {
                    length = String.valueOf(number).length();
                    result = number;
                }
            } else {
                if (String.valueOf(number).length() - 1 > length) {
                    length = String.valueOf(number).length() - 1;
                    result = number;

                }
            }
        }
        return result;
    }
}
