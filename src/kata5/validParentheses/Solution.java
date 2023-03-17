package kata5.validParentheses;

public class Solution {
    public static void main(String[] args) {
        System.out.println(validParentheses("())"));
    }
    private static boolean validParentheses(String parens) {
        char[] arr1 = parens.toCharArray();

        int counter = 0;
        for (char c : arr1) {
            if (c == '(' || c == ')') {
                counter++;
            }
        }

        char[] arr2 = new char[counter];
        int iter = 0;
        for (char c : arr1) {
            if (c == '(' || c == ')') {
                arr2[iter] = c;
                iter++;
            }
        }
        int a = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == '(') {
                a++;
            } else if (arr2[i] == ')') {
                a--;
            }
            if (a == -1) {
                return false;
            }
        }
        return a == 0;
    }
}
