package kata7.covfefe;

public class Covfefe {
    public static void main(String[] args) {
        System.out.println(covfefe("double space "));
    }

    public static String covfefe(String tweet) {
        return tweet.contains("coverage")?tweet.replace("coverage", "covfefe"):tweet+" covfefe";
    }
}
