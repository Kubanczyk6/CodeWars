package kata7.fixStringCase;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve("LnZwpZZNNLZgghvaAfGIrOYxq"));
        System.out.println("LnZwpZZNNLZgghvaAfGIrOYxq".length());
    }
    public static String solve(final String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                counter++;
            }
        }
        return counter >= Math.ceil((double)str.length()/2) ? str.toLowerCase() : str.toUpperCase();
    }
}
