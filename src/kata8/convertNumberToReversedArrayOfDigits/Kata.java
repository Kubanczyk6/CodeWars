package kata8.convertNumberToReversedArrayOfDigits;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(11548)));
    }
    public static int[] digitize(long n) {
        String a = new StringBuilder(String.valueOf(n)).reverse().toString();
        String [] array=a.split("");
int[] arr = new int[array.length];
        int index = 0;
        for (String s : array) {
            arr[index] = Integer.parseInt(s);
            index++;
        }
        return arr;
    }
}
