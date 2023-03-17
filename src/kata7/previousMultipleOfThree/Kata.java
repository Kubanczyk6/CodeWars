package kata7.previousMultipleOfThree;

public class Kata {
    public static void main(String[] args) {
        System.out.println(prevMultOfThree(1));
    }

    public static Integer prevMultOfThree(int n) {
        return n == 0 ? null : n % 3 == 0 ? Integer.valueOf(n) : prevMultOfThree(n / 10);
    }
}
