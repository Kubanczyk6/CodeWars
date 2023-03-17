package kata6.splitStrings;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("           ")));
    }

    public static String[] solution(String s) {
        String[] array = new String[(int) Math.ceil(((double) s.length() / 2))];
        int index = 0;
        int i = 0;
        for (String s1 : array) {
            array[i] = index == s.length() - 1 ? "" + s.charAt(index) + "_" : "" + s.charAt(index) + s.charAt(index + 1);
            index += 2;
            i++;
        }
        return array;
    }
}
