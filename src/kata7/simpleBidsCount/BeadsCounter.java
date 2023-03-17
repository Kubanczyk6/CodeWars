package kata7.simpleBidsCount;

public class BeadsCounter {
    public static void main(String[] args) {
        System.out.println(countRedBeads(5));
    }

    public static int countRedBeads(final int nBlue) {

        return nBlue == 0 ? 0 : 2 * (nBlue - 1);
    }
}
