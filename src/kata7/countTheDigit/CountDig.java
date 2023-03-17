package kata7.countTheDigit;

import java.util.LinkedList;
import java.util.List;

public class CountDig {
    public static void main(String[] args) {
        System.out.println(nbDig(5750,0));
    }
    public static int nbDig(int n, int d) {
        int counter = 0;
        int result = 0;
        List<String> list = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            result = i * i;
            list.add(String.valueOf(result));
        }
        for (String s : list) {
            for (String s1 : s.split("")) {
                if (s1.equals(String.valueOf(d))) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
