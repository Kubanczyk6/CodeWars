package kata7.switcheroo;

import java.util.Arrays;

public class switcherooo {
    public static String switcheroo(String x) {
        StringBuilder finals = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a') {
                finals.append("b");
            } else if (x.charAt(i) == 'b') {
                finals.append("a");
            } else {
                finals.append(x.charAt(i));
            }
        }

        return finals.toString();
    }
}
