package kata7.maximumLengthDifference;

import java.util.Arrays;

public class MaxDiffLength {
    public static void main(String[] args) {
        System.out.println(mxdiflg(new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"}, new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"}));
    }

    public static int mxdiflg(String[] a1, String[] a2) {

        int lengthMax = 0;
        for (String s : a2) {
            if (s.length() > lengthMax) {
                lengthMax = s.length();
            }
        }
        int lengthMin = Integer.MAX_VALUE;
        for (String s : a1) {
            if (s.length() < lengthMin) {
                lengthMin = s.length();
            }
        }
        int lengthMax1 = 0;
        for (String s : a1) {
            if (s.length() > lengthMax1) {
                lengthMax1 = s.length();
            }
        }
        int lengthMin1 = Integer.MAX_VALUE;
        for (String s : a2) {
            if (s.length() < lengthMin1) {
                lengthMin1 = s.length();
            }
        }


        return a1.length == 0 || a2.length == 0 ? -1 : Math.max(lengthMax - lengthMin, lengthMax1 - lengthMin1);
    }
}
