package kata7.inkrementer;

public class Kata {
    public static int[] incrementer(int[] numbers) {
        int[] array = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            array[i] = numbers[i] + i + 1;
        }
        return array;
    }
}
