import java.math.BigInteger;

public class Prime {
    public static void main(String[] args) {
        System.out.println(check(new BigInteger("20874961")));
    }


    public static boolean check(BigInteger bigInteger){
        return bigInteger.isProbablePrime(2);
    }
}

