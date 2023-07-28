package kata7.fireOnTheBoat;

public class CodeWars {
    public static void main(String[] args) {
        System.out.println(fireFight("Fire Deck Engine Sail Deck Fire Fire Fire Rudder Fire Boat Fire Fire Captain"));
    }
    public static String fireFight(String s) {

        return s.replaceAll("Fire","~~");
    }
}
