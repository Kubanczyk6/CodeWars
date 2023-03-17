package kata8.surfaceAreaAndAVolumeOfABox;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSize(4,2,6)));
    }
    public static int[] getSize(int w,int h,int d) {
       return new int[]{2*(w*h+w*d+h*d),w*d*h};
    }
}
