package kata6.consecutiveStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestConsec {
    public static void main(String[] args) {
        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2));
    }

    public static String longestConsec(String[] strarr, int k) {

        if (k > strarr.length||k<1) {
            return "";
        }
        int max = 0;
        int index =0;
        for (int i = 0; i <= strarr.length-k; i++) {
            String result = strarr[i];
            for (int j = i + 1; j < k+i; j++) {
                if (strarr[j].contains(result)) {
                    break;
                }
                result += strarr[j];
            }
            int soFar = result.length();
            if (soFar > max) {
                max = soFar;
                index = i;
            }
        }
        String result = "";
        for (int i = index; i < index+k; i++) {
            result+=strarr[i];
        }
        return result;
    }

}

