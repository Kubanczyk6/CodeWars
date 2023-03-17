package kata8.whatIsBetween;

public class Kata {
    public static int[] between(int a, int b) {
        int[] array = new int[b - a + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = a + i;
        }
        return array;
    }
}
