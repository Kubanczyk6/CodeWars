package kata7.validParentheses;

public class Kata {
    public static void main(String[] args) {
        System.out.println(validParentheses("())(()"));
    }

    public static boolean validParentheses(String parenStr) {
        return parenStr.contains("()")?validParentheses(parenStr.replace("()","")):parenStr.length()==0;
    }
}
