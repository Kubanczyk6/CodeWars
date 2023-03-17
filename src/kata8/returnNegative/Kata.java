package kata8.returnNegative;

public class Kata {
    public static void main(String[] args) {
        System.out.println(makeNegative(-7));
    }
    private static int makeNegative(final int x){
        return x<=0?x:-x;
    }
}
