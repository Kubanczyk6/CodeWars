package kata7.movedInSquaredStrings;

import java.util.function.Function;

public class Opstrings {
    public static void main(String[] args) {
        System.out.println(oper(Opstrings::vertMirror, "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu"));
    }

    public static String vertMirror (String strng) {
        String[]split=strng.split("\n");
        for (int i = 0; i <split.length ; i++) {
            split[i]=new StringBuilder(split[i]).reverse().toString();
        }
        return String.join("\n", split);
    }
    public static String horMirror (String strng) {
       String []split = strng.split("\n");
        for (int i = 0; i < split.length/2; i++) {
            String temp=split[i];
            split[i]=split[split.length-1-i];
            split[split.length-1-i]=temp;
        }

        return String.join("\n", split);

    }
    public static String oper(Function<String,String> operator, String s) {


        return operator.apply(s);
    }
}
