package kata7.disemvowelTrolls;

public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("jechala baba"));
    }
    private static String disemvowel(String str){
        return str.replaceAll("[AEOUIaeoui]", "");
    }
}
