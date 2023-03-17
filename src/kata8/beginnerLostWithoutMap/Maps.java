package kata8.beginnerLostWithoutMap;

import java.util.Arrays;

public class Maps {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{8,4,6,8})));
    }
    public static int[] map(int[] arr) {
return Arrays.stream(arr).map(i->i/2).toArray();
    }
}
