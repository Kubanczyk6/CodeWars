package kata8.sumOfMultiples;

public class Kata {
    public static void main(String[] args) {
        System.out.println(sumMul(2,9));
    }
    public static long sumMul(int n, int m) {
        if(n<0){
            throw new IllegalArgumentException();
        }
        int temp=n;
        long sum=0;
        while(n<m){
            sum+=n;
            n+=temp;
        }
        return sum;
    }
}
