package kata7.add;

import java.util.Arrays;
import java.util.Collections;

public class SillyAddition {
    public static void main(String[] args) {
        System.out.println(add(122, 81));
    }

    public static int add(int num1, int num2) {

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        String[] array1 = Arrays.stream(String.valueOf(num1).split("")).toArray(String[]::new);
        String[] array2 = Arrays.stream(String.valueOf(num2).split("")).toArray(String[]::new);

        int[] array = new int[array2.length];

        for (int i = 0; i < array1.length; i++) {
            array[i] = Integer.parseInt(array1[array1.length - 1 - i]) + Integer.parseInt(array2[array2.length - 1 - i]);
        }

        for (int i = array1.length; i < array2.length; i++) {
            array[i] = Integer.parseInt(array2[array2.length - 1 - i]);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[array.length - 1 - i]);
        }

        return Integer.parseInt(result.toString());
    }
}
