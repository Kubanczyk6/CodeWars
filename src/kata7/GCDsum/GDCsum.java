package kata7.GCDsum;

import java.util.Arrays;

public class GDCsum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(10,3)));
    }

    public static int[] solve(int s, int g) {
        for (int i = 1; i < s; i++) {
            if (i % g == 0) {
                int j = s - i;
                if (j % g == 0) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
