package kata7.responsibleDrinking;

import java.util.Arrays;

public class Drinkin {
    public static void main(String[] args) {
        Drinkin drinkin = new Drinkin();

        System.out.println(drinkin.hydrate("1 shot"));
    }

    public String hydrate(String drinkString) {

        int sum = Arrays.stream(drinkString.split(" ")).filter(this::checkElemIsInteger)
                .mapToInt(Integer::parseInt).sum();
        return sum + (sum == 1 ? " glass" : " glasses") + " of water";

    }

    private boolean checkElemIsInteger(String elem) {
        try {
            Integer.parseInt(elem);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
