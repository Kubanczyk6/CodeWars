package kata8.abbreviateATwoWordName;

public class AbbreviateTwoWord {
    public static void main(String[] args) {
        System.out.println(abbrevName("Ana Pom"));
    }
    public static String abbrevName(String name) {
        String[]string = name.split(" ");
        return Character.toUpperCase(string[0].charAt(0))+"."+Character.toUpperCase(string[1].charAt(0));
    }
}
