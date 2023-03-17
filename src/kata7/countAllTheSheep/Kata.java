package kata7.countAllTheSheep;

import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {
        System.out.println(lostSheep(new int[] {3,1,2}, new int[] {4,5}, 21));
    }

    public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {


        return sheepTotal - Arrays.stream(fridayNightCounting).sum()-Arrays.stream(saturdayNightCounting).sum();
    }
}
