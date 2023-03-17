package kata6.takeaTenMinutesWalk;

import java.util.LinkedList;
import java.util.List;

public class TenMinWalk {
    public static void main(String[] args) {
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    private static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int result = 0;
        for (char c : walk) {
            if (c == 'n' || c == 'w') {
                result++;
            } else if (c == 'e' || c == 's') {
                result--;
            }
        }
        return result == 0;

    }
}

