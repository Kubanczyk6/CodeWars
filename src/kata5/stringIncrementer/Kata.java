package kata5.stringIncrementer;

import java.math.BigInteger;
import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(incrementString("kLcMkyG+({044045203777939405357494648490443"));
    }

    public static String incrementString(String str) {
        System.out.println(str);
        String s = new StringBuilder(str).reverse().toString();
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder digitsWithoutZeros = new StringBuilder();
        StringBuilder zeros = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digits.append(s.charAt(i));
            } else {
                letters.append(s.substring(i));
                break;
            }
        }

        letters.reverse();
        char[] charArrayWithDigits = digits.reverse().toString().toCharArray();

        for (char charArrayWithDigit : charArrayWithDigits) {
            if (charArrayWithDigit == '0') {
                zeros.append(charArrayWithDigit);
            } else {
                digitsWithoutZeros.append(charArrayWithDigit);
            }
        }
        BigInteger i = BigInteger.valueOf(0);
        if (digitsWithoutZeros.length() > 0) {
            i = new BigInteger(digitsWithoutZeros.toString());
        } else if (zeros.length() > 0) {
            zeros.deleteCharAt(0);
        }
        BigInteger j = i.add(BigInteger.valueOf(1));

        if (String.valueOf(i).length() != String.valueOf(j).length() && zeros.length() > 0) {
            zeros.deleteCharAt(0);
        }
        return letters.append(zeros).append(j).toString();

    }
}
