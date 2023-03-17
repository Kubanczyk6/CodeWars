package kata7.testing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LineNumbering {
    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));

    }

    public static List<String> number(List<String> lines) {
        List<String> newList = new LinkedList<>();
        int index = 0;
        for (String line : lines) {
            index++;
            newList.add("" + index + ": " + line);
        }
        return newList;
    }
}
