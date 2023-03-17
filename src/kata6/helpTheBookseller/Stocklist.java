package kata6.helpTheBookseller;

import java.util.Arrays;

public class Stocklist {
    public static void main(String[] args) {
        System.out.println(stockSummary(new String[]{"CBART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}, new String[]{"A", "B", "C", "W"}));
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        System.out.println(Arrays.toString(lstOf1stLetter));
        System.out.println(Arrays.toString(lstOfArt));
        StringBuilder result = new StringBuilder();
        for (String s : lstOf1stLetter) {
            int x = 0;
            for (String s1 : lstOfArt) {
                if (s.equals(Character.toString(s1.charAt(0)))) {
                    for (int i = 0; i < s1.length(); i++) {
                        if (Character.isDigit(s1.charAt(i))) {
                            x += Integer.parseInt(s1.substring(i));
                            break;
                        }
                    }
                }
            }
            result.append("(")
                    .append(s).append(" : ")
                    .append(x).append(") - ");
        }

        return lstOfArt.length == 0 || lstOf1stLetter.length == 0 ? "" : result.substring(0, result.length() - 3);
    }
}
