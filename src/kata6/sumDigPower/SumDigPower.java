package kata6.sumDigPower;

import java.util.LinkedList;
import java.util.List;

public class SumDigPower {
    public static void main(String[] args) {
        System.out.println(sumDigPow(1,10000));
    }
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> list = new LinkedList<>();
        for (long i = a; i < b; i++) {
            long result = 0;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                result += Math.pow(Integer.parseInt(String.valueOf(String.valueOf(i).charAt(j))), j + 1);
            }
            if (result == i) {
                list.add(i);
            }
        }
        return list;
    }
}
