package kata7.powerOfTwo;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
    }

    public static boolean isPowerOfTwo(long n) {
        if(n<2&&n!=0){
            return true;
        }
        if(n%2!=0||n==0){
            return false;
        }


        return  isPowerOfTwo(n/2);
    }
}
