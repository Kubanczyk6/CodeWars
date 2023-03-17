package kata7.shortestWord;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
    private static int findShort(String s){
        int length = s.length();
        String [] array=s.split(" ");
        for (String s1 : array) {
            if(s1.length()<length){
                length=s1.length();
            }
        }
        return length;
    }
}
