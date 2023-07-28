package kata7.fourSeven;

import java.util.Map;

public class Kata {

    public static final Map<Integer,Integer> map = Map.of(
            4,7,
            7,4
    );

    public static int fourSeven(int n) {
        return map.getOrDefault(n,0);
    }
}
