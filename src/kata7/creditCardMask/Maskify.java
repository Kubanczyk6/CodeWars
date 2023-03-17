package kata7.creditCardMask;

import java.util.Arrays;

public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
    }
    private static String maskify(String str){
        return str.length()>4? "#".repeat(str.length()-4)+str.substring(str.length()-4):str;
    }
}
