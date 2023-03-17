package kata7.isograms;

import java.util.Arrays;

public class isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram(""));
    }
    private static boolean isIsogram(String str){
        return str.equals("") ||Arrays.stream(str.split("")).map(i->i.toLowerCase()).distinct().count()==str.length();
    }
}
