package kata7.makeAfunctionThatDoesArithmetic;

public class AritthemeticFunction {
    public static int arithmetic(int a, int b, String operator) {
       switch(operator){
           case "add"-> {
               return a+b;
           }
           case "subtract"->{
               return a-b;
           }
           case "multiply"->{
               return a*b;
           }
       }
       return a/b;
    }
}
