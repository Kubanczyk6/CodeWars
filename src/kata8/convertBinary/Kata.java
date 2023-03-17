package kata8.convertBinary;

public class Kata {
    public static void main(String[] args) {
        System.out.println(toBinary(5));
    }
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}
