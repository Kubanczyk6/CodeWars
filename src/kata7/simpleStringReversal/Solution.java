package kata7.simpleStringReversal;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve("your code rocks"));
    }

    public static String solve(String s) {
        StringBuilder sb = new StringBuilder();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                integerList.add(i);
            }
        }
        StringBuilder reverse = new StringBuilder(s.replace(" ", "")).reverse();
        for (int i = 0; i < reverse.length(); i++) {
            if (integerList.contains(sb.length())) {
                sb.append(" ").append(reverse.charAt(i));
            } else {
                sb.append(reverse.charAt(i));
            }
        }
        return sb.toString();
    }
}
