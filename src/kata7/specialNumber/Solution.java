package kata7.specialNumber;

import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(specialNumber(4643));

    }

    public static String specialNumber(int number)
    {
        System.out.println(number);

        return String.valueOf(number).replaceAll("[6-9]","").length()==String.valueOf(number).length() ?"Special!!":"NOT!!";
    }
}
