package kata7.circleOfNumbers;

public class CircleOfNumbers {
    public static void main(String[] args) {
        System.out.println(circleOfNumbers(6,3));
    }
    public static int circleOfNumbers(int n, int firstNumber) {
        return firstNumber>=n/2?firstNumber-n/2:firstNumber+n/2;
    }
}
