package beta.sortingbyalphabet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new String[] {"He121llo", "wo345rld"})));
    }

    public static String[] sort(String[] array) {

        if (array == null) {
            return null;
        }
        List<Integer> list = new LinkedList<>();

        for (String s : array) {
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                if(!(Character.isDigit(s.charAt(i))||Character.isAlphabetic(s.charAt(i)))){

                }else if (Character.isDigit(s.charAt(i))) {
                    result += 48 + Character.toLowerCase(s.charAt(i))-96;
                } else {
                    result += Character.toLowerCase(s.charAt(i))-96;
                }
            }
            list.add(result);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                String temp = array[j - 1];
                int tempList = list.get(j - 1);
                if (list.get(j - 1) < list.get(j)) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                    list.set(j - 1, list.get(j));
                    list.set(j, tempList);
                }
            }
        }
        return array;
    }
}
