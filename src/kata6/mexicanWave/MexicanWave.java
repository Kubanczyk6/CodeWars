package kata6.mexicanWave;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave("hello hello")));
    }

    public static String[] wave(String str) {

        str = str.toLowerCase();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                list.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1));
            }

        }

        return list.toArray(new String[0]);
    }
}
