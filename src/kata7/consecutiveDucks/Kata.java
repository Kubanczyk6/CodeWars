package kata7.consecutiveDucks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Kata {
    public static void main(String[] args) {
        System.out.println(consecutiveDucks(38));

    }

    public static boolean consecutiveDucks(int n) {
        int sum = 0;
        int counter = 0;
        for (int i = (n + 1) / 2; i > 0; i--) {
            sum += i;
            if (sum > n) {
                sum = 0;
                i+=counter-1;
                counter=0;
            } else{
                counter++;
            }
            if (sum == n) {
                return true;
            }
        }
return false;
        }
    }

