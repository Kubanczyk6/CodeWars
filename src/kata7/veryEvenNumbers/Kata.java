package kata7.veryEvenNumbers;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(isVeryEvenNumber(280));
    }

    public static boolean isVeryEvenNumber(int number) {

        while(number>9){
            number=Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).sum();
        }
        return number%2==0;
    }
}
