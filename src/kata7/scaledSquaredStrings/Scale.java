package kata7.scaledSquaredStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Scale {
    public static void main(String[] args) {
        System.out.println(scale("abcd\nefgh\nijkl\nmnop", 2, 3));
    }

    public static String scale(String strng, int k, int v) {
        String collect = Arrays.stream(strng.split("\n")).map(
                        s -> Arrays.stream(s.split(""))
                                .map(str -> str.repeat(k)).collect(Collectors.joining()).repeat(v))
                .collect(Collectors.joining("\n"));
        String[] split = collect.split("\n");
        List<String> list = new ArrayList<>();
        for (String s : split) {
            for (int i = 0; i < v; i++) {
                String substring = s.substring(0, s.length() / v);
                list.add(substring);
            }
        }
        return strng.length() == 0 ? "" : String.join("\n", list);
    }
}
