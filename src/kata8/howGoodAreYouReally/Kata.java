package kata8.howGoodAreYouReally;

import java.util.Arrays;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
       return Arrays.stream(classPoints).average().orElse(0)<yourPoints;
    }
}
