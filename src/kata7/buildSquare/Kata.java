package kata7.buildSquare;

public class Kata {
    public static void main(String[] args) {
        System.out.println(generateShape(5));
    }
    public static final String generateShape(int n) {
        return ("+".repeat(n)+"\n").repeat(n).trim();
    }
}
