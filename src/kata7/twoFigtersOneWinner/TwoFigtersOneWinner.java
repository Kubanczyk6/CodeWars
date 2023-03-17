package kata7.twoFigtersOneWinner;

public class TwoFigtersOneWinner {

    public static void main(String[] args) {

        System.out.println(declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));

    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAAttacker){
        if(firstAAttacker.equals(fighter1.name)){
            for (int i = fighter1.health;;) {
                fighter2.health-=fighter1.damagePerAttack;
                if(fighter2.health<=0){
                    return fighter1.name;
                }
                fighter1.health-=fighter2.damagePerAttack;
                if(fighter1.health<=0){
                    return fighter2.name;
                }
            }
        }else{
            for (int i = fighter1.health; ; ) {
                fighter1.health-=fighter2.damagePerAttack;
                if(fighter1.health<=0){
                    return fighter2.name;
                }
                fighter2.health-=fighter1.damagePerAttack;
                if(fighter2.health<=0){
                    return fighter1.name;
                }
            }
        }

    }
}
