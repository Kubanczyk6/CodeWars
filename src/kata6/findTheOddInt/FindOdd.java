package kata6.findTheOddInt;

import java.util.Arrays;

public class FindOdd {
    public static void main(String[] args) {
        System.out.println(findInt(new int[]{10}));
    }

    private static int findInt(int[] a) {
        Arrays.sort(a);
        int counter = 0;
        if(a.length==1){
            return a[0];
        }
        for (int i = 1; i < a.length; i++) {
            if (i != a.length - 1 && a[i] != a[i - 1] && a[i] != a[i + 1]) {
                return a[i];
            } else if (i == a.length - 1 && a[i] != a[i - 1]) {
                return a[i];
            }
            if (a[i] == a[i - 1]) {
                counter++;
                if (i == a.length - 1 && counter % 2 == 0) {
                    return a[i - 1];
                }
            } else {
                if (counter % 2 == 0) {
                    return a[i - 1];
                }
                counter = 0;
            }

        }
        return 0;
    }
}
