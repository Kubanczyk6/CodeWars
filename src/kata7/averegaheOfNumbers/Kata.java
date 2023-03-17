package kata7.averegaheOfNumbers;

import java.util.Arrays;

public class Kata {
    public static double[] averages(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
        if(numbers==null||numbers.length==0){
            return new double[]{};
        }

        double[] array = new double[numbers.length - 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = (double) (numbers[i] + numbers[i + 1]) / 2;
        }
        return array;
    }
}
