package kata7.shorterConcat;

public class ShorterConcat {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "bbbb";
        System.out.println(shorterReverseLonger(a, b));
    }

    public static String shorterReverseLonger(String a, String b) {
        if (a.length() < b.length()) {
            String temp = b;
            b = a;
            a = temp;
        }
        return String.format("%s%s%s", b, new StringBuilder(a).reverse(), b);

    }
}
