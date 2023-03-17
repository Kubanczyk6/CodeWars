package kata7.seeYouNextHappyYear;

import java.util.Arrays;
import java.util.stream.Stream;

public class HappyYear {
    public static void main(String[] args) {
        System.out.println(nextHappyYear(3331));
    }

    static public int nextHappyYear(int year) {
        System.out.println(year);
        // Your code is here ... See you Next Happy Year !!!
        return Stream.iterate(year+1,years->years+1)
                .dropWhile(years->Arrays.stream(String.valueOf(years).split("")).distinct().count()!=4)
                .findFirst()
                .orElseThrow();
    }
}
