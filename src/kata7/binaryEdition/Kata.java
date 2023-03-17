package kata7.binaryEdition;

public class Kata {
    public static void main(String[] args) {
        System.out.println(binaryAddition(5, 9));
    }

    private static String binaryAddition(int a, int b) {
        int c = a + b;
        StringBuilder result = new StringBuilder();
        for (int i = c; c != 0; c = c / 2) {
            if (c % 2 == 1) {
                result.append(1);
            } else {
                result.append(0);
            }
        }
        return result.reverse().toString();
    }
}
