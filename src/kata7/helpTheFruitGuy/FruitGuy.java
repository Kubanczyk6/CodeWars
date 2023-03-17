package kata7.helpTheFruitGuy;

import java.util.Arrays;

public class FruitGuy {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeRotten(new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"})));
    }
    public static String[] removeRotten(String[] fruitBasket) {



    return fruitBasket==null?new String[]{}: Arrays.stream(fruitBasket).map(i-> i.toLowerCase().replaceAll("rotten", "")).toArray(String[]::new);

    }
}
