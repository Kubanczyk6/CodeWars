package kata8.reversedStrings;

public class Kata {
    public static void main(String[] args) {
        System.out.println(solution("world"));
    }
    private static String solution(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
