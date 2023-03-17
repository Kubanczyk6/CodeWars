package kata7.regexValidatePinCode;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(validatePin("arethg"));
    }
    private static boolean validatePin(String pin){
        long count = Arrays.stream(pin.split("")).map(i -> i.replaceAll("[0123456789]", "")).filter(i->i.length()>0).count();
         return count==0&&(pin.length()==4||pin.length()==6);
    }

}
