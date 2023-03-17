package kata7.sumAtriangularNumbers;

public class Kata {
    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(6));
    }
    public static int sumTriangularNumbers(int n) {
        int result = 0;
        int sum=0;
        for (int i = 1; i <= n; i++) {
            result += i;
            sum+=result;
        }
        return  sum;
    }
}
