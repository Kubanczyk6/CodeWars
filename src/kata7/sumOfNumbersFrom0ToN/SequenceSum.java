package kata7.sumOfNumbersFrom0ToN;

public class SequenceSum {
    public static void main(String[] args) {
        System.out.println(showSequence(6));
    }

    public static String showSequence(int value) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        for (int i = 0; i <= value; i++) {
            result.append(i).append("+");
            sum += i;
        }


        return value == 0 ? "0=0" : value < 0 ? "" + value + "<0" : result.substring(0, result.length() - 1) + " = " + sum;
    }
}
