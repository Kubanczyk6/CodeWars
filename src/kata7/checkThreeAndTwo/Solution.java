package kata7.checkThreeAndTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(checkThreeAndTwo(new char[]{'b', 'b', 'b', 'c', 'b'}));
    }

    public static boolean checkThreeAndTwo(char[] chars) {
        System.out.println(Arrays.toString(chars));
        List<Character> list = new ArrayList<>();

        for (char aChar : chars) {
            list.add(aChar);
        }
        Collections.sort(list);
        int counter = 1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                counter++;
            } else {
                break;
            }
        }
        return (counter == 2 || counter == 3) && list.stream().distinct().count() == 2;
    }
}
