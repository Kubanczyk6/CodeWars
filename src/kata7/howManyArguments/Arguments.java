package kata7.howManyArguments;

import java.math.BigInteger;
import java.util.Arrays;

public class Arguments {
    public static void main(String[] args) {
        System.out.println(countArgs('a', 865, "asfhgajsf", new BigInteger("123456")));
    }

    public static int countArgs(Object... args) {
       return (int) Arrays.stream(args).count();
    }
}
