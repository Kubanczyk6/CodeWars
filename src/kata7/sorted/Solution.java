package kata7.sorted;

public class Solution {
    public static void main(String[] args) {
        int[] array = {33, 2, 19};
        System.out.println(isSortedAndHow(array));

    }

    public static String isSortedAndHow(int[] array) {

        if (array[0] < array[1]) {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1 && array[i] > array[i + 1]) {
                    return "no";
                }
            }
            return "yes, ascending";
        } else if (array[0] > array[1]) {
            for (int i = 0; i < array.length; i++) {
                if (i != array.length - 1 && array[i] < array[i + 1]) {
                    return "no";
                }
            }
        }
        return "yes, descending";
    }
}

