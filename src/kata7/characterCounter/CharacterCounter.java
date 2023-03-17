package kata7.characterCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCounter {
    public static void main(String[] args) {
        System.out.println(validateWord("?!?!?!"));
    }


    public static boolean validateWord(String word) {
        System.out.println(word);
       Map<Character,Integer> charactersMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
                Integer frequency = charactersMap.get(word.toLowerCase().charAt(i));
                charactersMap.put(word.toLowerCase().charAt(i), frequency == null ? 1 : frequency + 1);

        }
        charactersMap.forEach((k,v)-> System.out.printf("Key: %s - Value: %s%n",k,v));
        return charactersMap.values().stream().distinct().count() == 1;
    }

}

