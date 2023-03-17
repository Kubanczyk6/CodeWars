package kata7.moveTen;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveTen {
    public static void main(String[] args) {
        System.out.println(moveTen("testcase"));
    }
    public static String moveTen(String s) {
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int i1 = s.charAt(i) + 10;
            if(i1>122){
                i1-=26;
            }
            result.append((char) i1);
        }
        return result.toString();
    }

}
