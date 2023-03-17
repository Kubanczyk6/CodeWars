package kata7.brokenPhotocopier;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
        System.out.println(broken("10000000101101111110011001000"));
    }
    public static String broken(final String x) {
        return Arrays.stream(x.split(""))
                .map(s->s.equals("1")?"0":"1")
                .collect(Collectors.joining());

    }
}
