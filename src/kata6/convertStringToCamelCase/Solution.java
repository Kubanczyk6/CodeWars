package kata6.convertStringToCamelCase;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(toCamelCase(""));
    }


    private static String toCamelCase(String s) {
        if(s.length()==0){
            return "";
        }

        String[] array = s.split("[-_]");
        int i = 0;
        StringBuilder sb = new StringBuilder("");
        for (String s1 : array) {
            char c = 'a';
            if (i == 0) {
                c = s1.charAt(0);
            } else {
                c = Character.toUpperCase(s1.charAt(0));
            }
            array[i] = s1.replaceFirst(String.valueOf(s1.charAt(0)), String.valueOf(c));
            sb.append(array[i]);
            i++;
        }

        return sb.toString();


    }
}
