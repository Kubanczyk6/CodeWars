package kata6.whichAreIn;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WhichAreIn {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(inArray(new String[]{"cod", "code", "wars", "ewar", "pillow", "bed", "phht"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong", "codewars"})));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        List<String> list = new LinkedList<>();
        List<String> list1 = new LinkedList<>();

        list.addAll(Arrays.asList(array1));
        list1.addAll(Arrays.asList(array2));
        List<String> finalList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(j).contains(list.get(i))) {
                    finalList.add(list.get(i));
                    break;
                }
            }
        }
        Collections.sort(finalList);


        return finalList.toArray(new String[0]);

    }
}
