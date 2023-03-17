package kata7.countTheDivisorsOfANumber;

public class FindDivisor {
    public static void main(String[] args) {
        System.out.println(numberOfDivisors(30));
    }

    public static long numberOfDivisors(int n) {
        long counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        return counter;
    }
}
