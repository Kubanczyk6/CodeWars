package kata7.removewConsecutiveDuplicateWords;

import java.util.ArrayList;
import java.util.List;


public class Kata {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    }

    public static String removeConsecutiveDuplicates(String s) {
        List<String> split = new ArrayList<>(List.of(s.split(" ")));
        for (int i = 0; i < split.size() - 1; i++) {
            if (split.get(i).equals(split.get(i + 1))) {
                split.remove(i);
                i--;
            }
        }
        return String.join(" ", split);
    }
}
