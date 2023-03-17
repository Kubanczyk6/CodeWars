package kata7.halvingSum;

public class HalbingSum {
    public static void main(String[] args) {
        System.out.println(halvingSum(25));
    }
    static int halvingSum(int n) {
return n>0?n+halvingSum(n/2):0;
    }
}
