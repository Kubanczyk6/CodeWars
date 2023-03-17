package kata7.youAreASquare;

public class Square {
    public static void main(String[] args) {
        System.out.println(isSquare(25));
    }
    private static boolean isSquare(int n){
        return n == 0 || n % Math.sqrt(n) == 0;
    }
}
