package kata7.strongNumber;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println(isStrongNumber(145));
    }
    public static String isStrongNumber(int num) {
        int num1 = num;
        int result=0;
        while (num1 > 0) {
            int rest = num1 % 10;
            int first = 1;
            for (int i = 2; i <= rest; i++) {
                first*= i;
            }
            result+=first;
            num1 = num1 / 10;
        }

        return result==num?"STRONG!!!!":"Not Strong !!";
    }
}
