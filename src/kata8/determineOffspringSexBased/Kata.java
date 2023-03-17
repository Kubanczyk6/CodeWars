package kata8.determineOffspringSexBased;

public class Kata {

    public static void main(String[] args) {
        System.out.println(chromosomeCheck("XX"));
    }

    public static String chromosomeCheck(String sperm) {
       return "Congratulations! You're going to have a "+ (sperm.contains("Y")?"son.":"daughter.");
    }
}
