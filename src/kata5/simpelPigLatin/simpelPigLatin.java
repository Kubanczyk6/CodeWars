package kata5.simpelPigLatin;

import java.util.Arrays;

public class simpelPigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool !"));
    }

    private static String pigIt(String str) {
        String[] array = str.split(" ");

        for (int i = 0; i < array.length; i++) {
            char a = array[i].charAt(0);
            char[] arrays = array[i].toCharArray();
            array[i] = "";
            int counter = 0;
            for (char c : arrays) {
                if (counter != 0) {
                    array[i] += c;
                }
                if (counter == arrays.length - 1) {
                    array[i] += a;
                    if (Character.isAlphabetic(c)) {
                        array[i] += "ay";
                    }
                }
                counter++;
            }
        }
        String result = "";
        for (String s : array) {
            result += s + " ";
        }
        return result.trim();
    }
}
