package kata7.luckyNumber;

import java.util.Arrays;

public class LuckyNumber {
    public static void main(String[] args) {
        System.out.println(isLucky(1892376));
    }

    public static boolean isLucky(long n) {
      return  Arrays.stream(String.valueOf(n)
              .split(""))
              .mapToInt(Integer::parseInt)
              .sum()%9==0;
    }
}
