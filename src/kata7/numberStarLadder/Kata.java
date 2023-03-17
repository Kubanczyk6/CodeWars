package kata7.numberStarLadder;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(pattern(1));
    }

    public static String pattern(int n){
       return ("1\n"+ IntStream.rangeClosed(1,n)
               .mapToObj(i->1+"*".repeat(i-1)+i)
               .skip(1)
               .collect(Collectors.joining("\n"))).trim();
    }
}
