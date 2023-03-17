package kata7.squareEveryDigit;

public class SquareDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(0));
    }
    private static int squareDigits(int n){
        String a = String.valueOf(n);
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            result += (int) Math.pow(Integer.parseInt(String.valueOf(a.charAt(i))), 2);
        }
        return Integer.parseInt(result);
    }
}
