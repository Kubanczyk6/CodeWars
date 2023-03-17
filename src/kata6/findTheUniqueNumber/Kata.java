package kata6.findTheUniqueNumber;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Kata {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }

    private static double findUniq(double arr[]) {
        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] != arr[i + 1]) {
                return arr[i];
            } else if (i == arr.length - 1 && arr[i] != arr[i - 1]) {
                return arr[i];
            } else if (i!=0&&i!= arr.length-1&&arr[i]!= arr[i - 1] && arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return 0;
    }
}
