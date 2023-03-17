package kata7.findTheNextPerfectSquare;

public class NumberFun {
    public static void main(String[] args) {
        System.out.println(findNextSquare(25));
    }
    private static long findNextSquare(long sq){
        return Math.sqrt(sq)%1!=0?-1:(long)Math.pow(Math.sqrt(sq)+1,2);
    }
}
