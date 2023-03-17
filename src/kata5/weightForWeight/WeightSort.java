package kata5.weightForWeight;

import java.util.LinkedList;
import java.util.List;

public class WeightSort {
    public static void main(String[] args) {
        System.out.println(orderWeight("2 2000 10003 1234000 44444444 9999 11 11 22 123 1000 1111 1001 "));
    }

    private static String orderWeight(String strng) {
        String[] array = strng.split(" ");

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            int sumDigits = 0;
            for (int j = 0; j < array[i].length(); j++) {
                sumDigits += Integer.parseInt(String.valueOf(array[i].charAt(j)));
                if (j == array[i].length() - 1) {
                    list.add(sumDigits);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                String temp = array[j - 1];
                int tempList = list.get(j - 1);
                if ((list.get(j) < list.get(j - 1))) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                    list.set(j - 1, list.get(j));
                    list.set(j, tempList);
                }
            }
        }

        int i = 0;
        while (i < array.length) {
            extracted(array, list);
            i++;
        }


        String result = "";
        for (String s : array) {
            result += s + " ";
        }
        return result.trim();
    }

    private static void extracted(String[] array, List<Integer> list) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length() && j < array[i + 1].length(); j++) {
                String temp = array[i];
                int tempList = list.get(i);
                if (list.get(i).equals(list.get(i + 1)) && Integer.parseInt(String.valueOf(array[i].charAt(j))) > Integer.parseInt(String.valueOf(array[i + 1].charAt(j)))) {
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, tempList);
                    break;
                }
                if (!String.valueOf(array[i + 1].charAt(j)).equals(String.valueOf(array[i].charAt(j)))) {
                    break;
                }
            }
        }
    }
}
