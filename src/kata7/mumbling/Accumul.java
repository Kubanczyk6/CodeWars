package kata7.mumbling;

public class Accumul {
    public static void main(String[] args) {
        System.out.println(accum("cwAT"));
    }

    private static String accum(String s) {

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                result += String.valueOf(s.charAt(i)).toUpperCase() + "-";
            } else if (i == s.length() - 1) {
                result += String.valueOf(s.charAt(i)).toUpperCase() + String.valueOf(s.charAt(i)).repeat(i).toLowerCase();
            } else {
                result += String.valueOf(s.charAt(i)).toUpperCase() + String.valueOf(s.charAt(i)).repeat(i).toLowerCase() + "-";
            }
        }
        return result;
    }
}
