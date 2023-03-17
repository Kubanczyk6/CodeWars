package kata7.pandemia;

import java.util.Arrays;

public class Pandemia {
    public static void main(String[] args) {
        System.out.println(infected("0X0X000000000000X000000000000000000000X0000000000X0000000000000000X0X000000000000000X000000000000X000XX0000000000000000X1000000000000000X00000XX00000000000000000X000000000000000000000000X0000X00000000XX00000000X00X000000X000000000000000000000000X0010X0X00000000000000000000X00X0000000000000000X00100"));
    }

    public static double infected(String input) {
        long infected = Arrays.stream(input.split("X"))
                .filter(s -> s.contains("1"))
                .flatMap(s -> Arrays.stream(s.split("")))
                .count();
        long all = Arrays.stream(input.split("X"))
                .filter(s -> !"".equals(s))
                .flatMap(s -> Arrays.stream(s.split("")))
                .count();
        return all == 0 ? 0 : (double) infected / all * 100;
    }
}
