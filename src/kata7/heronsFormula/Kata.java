package kata7.heronsFormula;

public class Kata {
    public static void main(String[] args) {
        System.out.println(heron(3,4,5));
    }

    public static double heron(double a, double b, double c)
    {
       double s=(a+b+c)/2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
