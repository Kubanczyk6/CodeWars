package kata7.printerErrors;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Printer {
    public static void main(String[] args) {
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
    }

    private static String printerError(String s) {

        long count = s.chars().filter(i -> i <= 'm').count();
        long errors = s.length() - count;

        return errors + "/" + (count + errors);


    }
}
