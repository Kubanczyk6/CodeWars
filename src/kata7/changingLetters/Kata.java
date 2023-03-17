package kata7.changingLetters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
public static final List<String> vowelList = List.of("a","e","i","o","u");

    public static String swap(String st){
        return Arrays.stream(st.split(""))
                .map(c-> vowelList.contains(c)?c.toUpperCase():c)
                .collect(Collectors.joining());
    }
}
