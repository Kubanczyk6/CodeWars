package kata7.simpleEquationReversal;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve("100*b/y"));
    }

    public static String solve(String eq){
        StringBuilder result=new StringBuilder();
        StringBuilder number= new StringBuilder();
        for (int i = eq.length()-1; i >=0; i--) {
            if(Character.isDigit(eq.charAt(i))){
                number.append(eq.charAt(i));
            } else{
                number= number.reverse();
                result.append(number).append(eq.charAt(i));
                number=new StringBuilder();
            }

        }
        return result.toString();
    }
}
