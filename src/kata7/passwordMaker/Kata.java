package kata7.passwordMaker;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
        System.out.println(makePassword("Give me liberty or give me death"));
    }



    public static String makePassword(String phrase) {
       return phrase.length()==0?"": Arrays.stream(phrase.split(" ")).map(Kata::validate).collect(Collectors.joining());
    }

    private static String validate(String s) {
        return s.charAt(0) == 'i' || s.charAt(0) == 'I' ? "1" :
                s.charAt(0) == 'o' || s.charAt(0) == 'O' ? "0" :
                        s.charAt(0) == 's' || s.charAt(0) == 'S' ? "5" : String.valueOf(s.charAt(0))
                ;
    }
}
