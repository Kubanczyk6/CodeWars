package kata8.smallestUnisedID;

import java.util.Arrays;

public class Kata {
    public static int nextId(int[] ids) {
        System.out.println(Arrays.toString(ids));
        Arrays.sort(ids);
        int valid = 0;

        for (int id : Arrays.stream(ids).distinct().toArray()) {
            if (id != valid) {
                return valid;
            }
            valid++;
        }
        return valid;
    }
}
