package kata7.letterBoxPaint;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dinglemouse {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(paintLetterboxes(125,132)));
    }


    public static int[] paintLetterboxes(final int start, final int end) {
        String collect = IntStream.rangeClosed(start, end).mapToObj(String::valueOf).collect(Collectors.joining());

       return IntStream.rangeClosed(0,9)
               .map(i-> (int)Arrays.stream(collect.split(""))
                       .filter(a->Integer.parseInt(a)==i)
                       .count())
               .toArray();

    }}
