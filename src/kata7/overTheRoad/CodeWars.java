package kata7.overTheRoad;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CodeWars {
    public static void main(String[] args) {
        System.out.println(overTheRoad(7, 11));
    }

    public static long overTheRoad(long address, long n) {


        return n*2-address+1;
    }
}
