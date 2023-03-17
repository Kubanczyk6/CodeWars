package kata7.theFuscFunction;

public class Kata {

    public static void main(String[] args) {
        System.out.println(fusc(85));
    }

    public static int fusc(int n) {
        return n == 0 ? 0 :
                n == 1 ? 1 :
                        n % 2 == 0 ? fusc(n / 2) :
                                fusc(n / 2) + fusc(n / 2 + 1);
    }
}
