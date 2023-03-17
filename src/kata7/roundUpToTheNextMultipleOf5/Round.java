package kata7.roundUpToTheNextMultipleOf5;

public class Round {
    public static void main(String[] args) {
        System.out.println(roundToNext5(-11));

    }

    public static int roundToNext5(int number) {
        int numberAbs = Math.abs(number);
        return number % 5 == 0 ? number : number < 0 ? -(numberAbs - (numberAbs % 5)) : number + (5 - number % 5);
    }


}

