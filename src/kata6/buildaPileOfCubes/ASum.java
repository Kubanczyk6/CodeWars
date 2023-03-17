package kata6.buildaPileOfCubes;

public class ASum {
    public static void main(String[] args) {
        System.out.println(findNb(36));
    }

    public static long findNb(long m) {


        for (long i = 1; i < (long)Math.sqrt(m); i++) {
            m=m-(long)Math.pow(i, 3);
            if (m==0) {
                return i;
            } else if (m<0) {
                break;
            }
        }
        return -1;
    }
}

