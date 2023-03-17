package kata7.bumpsInTheRoad;

public class BumpsTheRoad {
    public static String bumps(final String road) {
        return road.chars().filter(i->i=='n').count()>15?"Car Dead":"Woohoo!";
    }
}
