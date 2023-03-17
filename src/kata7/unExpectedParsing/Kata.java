package kata7.unExpectedParsing;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static void main(String[] args) {
        System.out.println(getStatus(true).get("status"));
    }

    public static Map<String, String> getStatus(boolean isBusy) {
        return isBusy?new HashMap<>(Map.of("status","busy")):new HashMap<>(Map.of("status","available"));

    }
}
