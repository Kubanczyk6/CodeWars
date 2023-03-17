package kata7.sumOfNumbers;

public class Sum {
    public static void main(String[] args) {
        System.out.println(getSum(-12,-14));
    }
    private static int getSum(int a, int b){
        return a==b?a:(Math.abs(b-a)+1)*(a+b)/2;
    }
}
