package kata8.wellOfIdeas;

import java.util.Arrays;

public class Kata {
    public static String well(String[] x) {
        long count = Arrays.stream(x).filter("good"::equals).count();
        return count > 2 ? "I smell a series!" : count > 0 ? "Publish!" : "Fail!";
    }
}
