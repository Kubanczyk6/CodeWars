package kata7.foldingYourWayToTheMoon;

public class PaperFolder {
    public static void main(String[] args) {
        System.out.println(fold(384000000.0));
    }
    public static Long fold(Double distance) {
        double x = 0.0001;
        long counter = 0L;
        while (x <= distance) {
            x *= 2;
            counter++;
        }
        return distance < 0 ? null : counter;
    }
}
