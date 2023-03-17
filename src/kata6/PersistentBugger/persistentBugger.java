package kata6.PersistentBugger;

import java.util.Arrays;

public class persistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(999));
    }

    private static int persistence(long n) {
        String a = String.valueOf(n);
        String[] array = a.split("");
        int result = 1;
        for (String s : array) {
            result *= Integer.parseInt(s);
        }
        return n<10?0:result>=10?persistence(result)+1:1;
    }
}
