package kata8.youNeedOnlyTheOne;

import java.util.Arrays;

public class Solution {
    public static boolean check(Object[] a, Object x) {
        // Your code here
        return Arrays.asList(a).contains(x);
    }
}
