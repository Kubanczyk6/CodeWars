package kata7.allUnique;

public class Kata {
    public static boolean hasUniqueChars(String str) {
        return str.chars().distinct().count()==str.length();
    }
}
