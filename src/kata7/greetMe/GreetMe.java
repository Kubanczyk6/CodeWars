package kata7.greetMe;

public class GreetMe {
    public static void main(String[] args) {
        System.out.println(greet("BILLY"));
    }
    public static String greet(String name){
        String lowerCase=name.toLowerCase();
        return "Hello "+ lowerCase.replaceFirst(String.valueOf(lowerCase.charAt(0)),String.valueOf(Character.toUpperCase(lowerCase.charAt(0))))+"!";
    }
}
