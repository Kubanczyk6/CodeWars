package kata6.validBraces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BraceChecker {
    public static void main(String[] args) {
        System.out.println(isValid("{}({})[]"));
    }

    public static boolean isValid(String braces) {
        String[] arr = braces.split("");

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j - 1).equals("(") && list.get(j).equals(")")) {
                    list.remove(j);
                    list.remove(j - 1);
                    i--;
                    break;
                }
                if (list.get(j - 1).equals("[") && list.get(j).equals("]")) {
                    list.remove(j);
                    list.remove(j - 1);
                    i--;
                    break;
                }
                if (list.get(j - 1).equals("{") && list.get(j).equals("}")) {
                    list.remove(j);
                    list.remove(j - 1);
                    i--;
                    break;
                }
            }
        }

        return list.size() == 0;
    }
}
