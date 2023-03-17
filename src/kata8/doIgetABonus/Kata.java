package kata8.doIgetABonus;

public class Kata {
    public static String bonusTime(final int salary, final boolean bonus) {
       return bonus?"£ "+10*salary :"£ "+salary;
    }
}
