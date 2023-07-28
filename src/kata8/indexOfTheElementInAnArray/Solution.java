package kata8.indexOfTheElementInAnArray;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        String[] array = {"2", "3", "5", "7", "11"};
        System.out.println(kata(array, "111"));
    }


    static String kata(String[]a,String s){
        String r = Integer.toString(Arrays.binarySearch(a, s));
        return Integer.parseInt(r)<0?"Not found":r;
}}


