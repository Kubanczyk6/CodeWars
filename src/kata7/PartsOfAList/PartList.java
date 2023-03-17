package kata7.PartsOfAList;

import java.util.Arrays;

public class PartList {

    public static void main(String[] args) {
        System.out.println();
    }

    public static String[][] partlist(String[] arr) {
        String[][] array = new String[arr.length - 1][2];


        for (int i = 0; i < array.length; i++) {
            String first = "";
            String second = "";
            int k = 0;
            for (String s : arr) {
                if (k <= i) {
                    first += s + " ";
                } else {
                    second += s + " ";
                }
                k++;
            }
            array[i] = new String[]{first.trim(), second.trim()};

        }
        return array;
    }
}
