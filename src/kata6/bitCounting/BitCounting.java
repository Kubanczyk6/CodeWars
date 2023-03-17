package kata6.bitCounting;

public class BitCounting {

    public static void main(String[] args) {
        System.out.println(countBits(7));
    }
    private static int countBits(int n){
        int result = 0;
        for (int i = n; n>=1 ; n=n /2) {
            result+=n%2;
        }
        return result;
    }
}
