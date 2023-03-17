package kata7.simpleStringCharacters;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H")));
    }
    public static int[] Solve(String word) {
        int lowerCase=0;
        int upperCase=0;
        int digit=0;
        int specialSigns=0;
        for (int i = 0; i < word.length(); i++) {
            if(Character.isLowerCase(word.charAt(i))){
                lowerCase++;
            } else if(Character.isAlphabetic(word.charAt(i))){
                upperCase++;
            } else if(Character.isDigit(word.charAt(i))){
                digit++;
            } else{
                specialSigns++;
            }
        }
        return new int[]{upperCase,lowerCase,digit,specialSigns};

    }
}
