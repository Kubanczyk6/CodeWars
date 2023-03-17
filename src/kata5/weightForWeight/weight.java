package kata5.weightForWeight;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class weight {
    public static void main(String[] args) {
        System.out.println(orderWeight("10003 1234000 44444444 9999 2000 123456789"));
    }

    public static String orderWeight(String strng) {
        System.out.println(strng);

        List<Integer> list = new LinkedList<>();
        String[] array = strng.split(" ");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int result = 0;
            for (int j = 0; j < array[i].length(); j++) {
                result += Integer.parseInt(Character.toString(array[i].charAt(j)));
            }
            list.add(result);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j =1; j < array.length - i; j++) {
                if (list.get(j - 1) > list.get(j)) {
                    int tempList = list.get(j - 1);
                    String tempArray = array[j - 1];
                    list.set(j - 1, list.get(j));
                    list.set(j, tempList);
                    array[j - 1] = array[j];
                    array[j] = tempArray;
                }
            }
        }
        return String.join(" ", array);
    }
}


