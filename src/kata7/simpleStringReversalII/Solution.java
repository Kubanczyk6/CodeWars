package kata7.simpleStringReversalII;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve("codingIsFun",2,100));
    }

    public static String solve(String s, int a, int b) {
        b=b>=s.length()?s.length()-1:b;
        String first = s.substring(0, a);
        String second = new StringBuilder(s.substring(a, b + 1)).reverse().toString();
        String third = s.substring(b + 1);
        return first + second + third;
    }
}
