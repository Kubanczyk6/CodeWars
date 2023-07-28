package kata7.CaffeineScript;

public class CaffeineBuzz {
    public static void main(String[] args) {
        System.out.println(caffeineBuzz(12));
    }

    public static String caffeineBuzz(int n) {
        return n % 4 == 0 && n % 3 == 0 ? "CoffeeScript" : n % 3 == 0 && n % 2 == 0 ? "JavaScript" : n % 3 == 0 ? "Java" : "mocha_missing!";
    }
}
