package kata7.reverseTheBitsInAnInteger;

public class BitsOfInteger {
    public static void main(String[] args) {
        reverse_bits(417);
    }

    public static int reverse_bits(int n){
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(),2);
    }
}
