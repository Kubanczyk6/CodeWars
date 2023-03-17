package kata7.triangularTreasure;

public class Triangular {
    public static void main(String[] args) {
        System.out.println(triangular(1275));
    }

    public static long triangular(long n) {
        return n <= 0 ? 0 : n * (1 + n) / 2;
    }
}
