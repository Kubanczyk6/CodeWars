package kata7.smallestValueOfAnArray;

public class Arrays {
    public static int findSmallest(final int[] numbers, final String toReturn) {
        int min = java.util.Arrays.stream(numbers).min().orElse(0);
        int index = 0;

        for (int number : numbers) {
            if (number == min) {
                break;
            }
            index++;
        }
        return toReturn.equals("index") ? index : min;
    }
}
