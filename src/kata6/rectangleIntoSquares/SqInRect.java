package kata6.rectangleIntoSquares;

import java.util.LinkedList;
import java.util.List;

public class SqInRect {
    public static void main(String[] args) {
        System.out.println(sqInRect(20, 14));
    }

    public static List<Integer> sqInRect(int lng, int wdth) {
        System.out.println(lng);
        System.out.println(wdth);
        if (lng == wdth) {
            return null;
        }
        List<Integer> list = new LinkedList<>();
        if (lng > wdth) {
            int temp = lng;
            lng = wdth;
            wdth = temp;
        }
        while (wdth != 0 && lng != 0) {
            list.add(lng);
            wdth -= lng;
            if (wdth < lng) {
                int temp = wdth;
                wdth = lng;
                lng = temp;
            }
        }
        return list;
    }
}
