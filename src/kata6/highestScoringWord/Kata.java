package kata6.highestScoringWord;

import java.util.LinkedList;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        System.out.println(high("aa b"));
    }

    public static String high(String s) {
        String[] array = s.split(" ");
        List<Integer> list = new LinkedList<>();

        for (String string : array) {
            int result = 0;
            for (int i = 0; i < string.length(); i++) {
                result += string.charAt(i) - 96;
            }
            list.add(result);
        }


        String max = "";
        int maxList = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxList < list.get(i)) {
                max = array[i];
                maxList = list.get(i);
            }
        }

        return max;
    }
}
