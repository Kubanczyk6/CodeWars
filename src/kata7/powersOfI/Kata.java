package kata7.powersOfI;

import java.util.Map;

public class Kata {

    public static final Map<Integer, String> map = Map.of(
            0, "1",
            1, "i",
            2, "-1",
            3, "-i");

    public static String pofi(int n) {
        return map.get(n % 4);
    }
}
