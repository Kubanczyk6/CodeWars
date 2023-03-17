package kata7.catsAndShelves;

public class Kata {
    public static void main(String[] args) {
        System.out.println(solution(964,981));
    }
    public static int solution(int start, int finish)
    {
        return (finish-start)%3==2? (int) Math.ceil((finish-start)/3.)+1:(int) Math.ceil((finish-start)/3.);
    }
}
