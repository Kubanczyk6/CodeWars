package kata7.moneyMoneyMoney;

public class Money {

    public static void main(String[] args) {
        System.out.println(calculateYears(1000,0.01625,0.18,1200));
    }
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        return principal<desired?calculateYears(principal+(principal*interest- tax*(principal*interest)),interest,tax,desired)+1:0;
    }
}
