package kata7.rotateForAMax;

public class MaxRotate {
    public static void main(String[] args) {
        System.out.println(maxRot(507992495));
    }

    public static long maxRot(long n) {
        System.out.println(n);
        String toString = "" + n;
        long max = 0;
        for (int i = 0; i < toString.length(); i++) {
            max = Math.max(max, Long.parseLong(toString));
            char temp = toString.charAt(i);
            toString = i > 0 ? toString.substring(0, i) + toString.substring(i + 1) + temp : toString.substring(i + 1) + temp;

        }
        return max;
    }
}
