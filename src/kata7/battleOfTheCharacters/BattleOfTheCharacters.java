package kata7.battleOfTheCharacters;

public class BattleOfTheCharacters {
    public static void main(String[] args) {
        System.out.println(battle("AAA", "Z"));
    }

    public static String battle(final String x, final String y) {
        return x.chars().map(i->i-64).sum() > y.chars().map(i->i-64).sum() ? x :
                x.chars().map(i->i-64).sum() < y.chars().map(i->i-64).sum() ? y : "Tie";
    }
}
