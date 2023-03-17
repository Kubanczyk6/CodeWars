package kata7.bingo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BingoOrNot {
public static final List<Integer> list= List.of(2,9,14,7,15);
    public static String bingo(int[] numberArray){
        return new HashSet<>(Arrays.stream(numberArray).boxed().toList()).containsAll(list)?"WIN":"LOSE";
    }

    public static void main(String[] args) {
        System.out.println(bingo(new int[]{21,13,2,7,5,14,7,15,9,10}));
    }
}
