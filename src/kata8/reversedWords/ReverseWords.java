package kata8.reversedWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("I like eating"));
    }
    public static String reverseWords(String str){
        String [] array = str.split(" ");
        for (int i = 0; i < array.length/2; i++) {
            String temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
      return String.join(" ", array);
    }
}
