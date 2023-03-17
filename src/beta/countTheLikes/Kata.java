package beta.countTheLikes;

import java.util.Arrays;

public class Kata {
    public static boolean evalLikes(String[] words) {
        long count = Arrays.stream(words).filter("like"::equalsIgnoreCase).count();
        return (double)count/words.length*100>5;
    }
}
