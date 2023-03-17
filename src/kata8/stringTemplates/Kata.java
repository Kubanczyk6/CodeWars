package kata8.stringTemplates;

public class Kata {
    public static void main(String[] args) {
        System.out.println(buildString("Cheese", "Milk", "Chocolate"));
    }

    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }
}
