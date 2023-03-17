package kata7.ATM;

public class ATM {
    public static void main(String[] args) {
        System.out.println(solve(770));
    }

    public static int solve(int n) {
        int numberOf500 = n / 500;
        int numberOf200 = (n - numberOf500 * 500) / 200;
        int numberOf100 = (n - numberOf500 * 500 - numberOf200 * 200) / 100;
        int numberOf50 = (n - numberOf500 * 500 - numberOf200 * 200 - numberOf100 * 100) / 50;
        int numberOf20 = (n - numberOf500 * 500 - numberOf200 * 200 - numberOf100 * 100 - numberOf50 * 50) / 20;
        int numberOf10 = (n - numberOf500 * 500 - numberOf200 * 200 - numberOf100 * 100 - numberOf50 * 50 - numberOf20 * 20) / 10;


        return n % 10 != 0 ? -1 : numberOf10 + numberOf20 + numberOf50 + numberOf100 + numberOf200 + numberOf500;
    }


}
