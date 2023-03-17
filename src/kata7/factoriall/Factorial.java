package kata7.factoriall;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static long factorial(int n) {
        long result=1;
        for (int i = 2; i <=n ; i++) {
            result*=i;
        }
        return result;
}}
