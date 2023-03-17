package kata7.helpSuzukiRakeHisGarden;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
        System.out.println(rakeGarden("slug spider rock gravel gravel gravel gravel gravel gravel gravel"));
    }

    public static String rakeGarden(String garden)
    {

        return Arrays.stream(garden.split(" "))
                .map(s->"rock".equals(s)?s:"gravel")
                .collect(Collectors.joining(" "));
    }
}
