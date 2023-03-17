package kata7.spoonerizeMe;

import java.util.stream.Stream;

public class Spooner {
    public static void main(String[] args) {
        System.out.println(spoonerize("nit picking"));
    }

    public static String spoonerize(String words) {
        String firstString = words.split(" ")[0];
        String secondString = words.split(" ")[1];
        char firstChar = firstString.charAt(0);
        char secondChar = secondString.charAt(0);
       return String.format("%s%s %s%s",
               secondChar,
               firstString.substring(1),
               firstChar,
               secondString.substring(1));
    }
}
