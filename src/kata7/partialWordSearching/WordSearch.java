package kata7.partialWordSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSearch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWord("ade", new String[]{"lemonade", "limeade", "Yoo-Hoo", "root beer", "grapeade ", "water", "Mr. Pibb"})));
    }

    static String[] findWord(String x, String[] y) {

        List<String> list = new ArrayList<>();
        for (String s : y) {
            if (s.toLowerCase().contains(x.toLowerCase())) {
                list.add(s);
            }
        }

        return list.isEmpty() ? new String[]{"Empty"} : list.toArray(new String[0]);
    }
}
