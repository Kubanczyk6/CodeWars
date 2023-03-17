package kata7.growthOfPopulation;

public class Arge {
    public static void main(String[] args) {
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
    }
    private static int nbYear(int p0, double percent, int aug, int p){
        p0=(int)(p0+p0*percent/100+aug);
        return p0<p?nbYear(p0, percent, aug, p)+1:1;
    }
}
