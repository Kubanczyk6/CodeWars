package kata7.allinclusive;

import java.util.*;

public class Rotations {
    public static void main(String[] args) {
        String a = "baba";
        String b = "abba";
        System.out.println(containAllRots("QJAhQmS", Arrays.asList("hQmSQJA", "QJAhQmS", "QmSQJAh", "yUgUXoQE", "AhQmSQJ", "mSQJAhQ", "SQJAhQm", "JAhQmSQ")));


    }

    private static boolean containAllRots(String strng, List<String> arr) {
        System.out.println(strng);
        System.out.println(arr);
        for (int i = 0; i < strng.length(); i++) {
            strng = strng.substring(1) + strng.charAt(0);
            if(!arr.contains(strng)){
                return false;
            }
        }
        return true;
    }
}
