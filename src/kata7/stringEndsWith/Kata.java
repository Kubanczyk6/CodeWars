package kata7.stringEndsWith;

public class Kata {

    public static void main(String[] args) {
        System.out.println(solution("", ""));
    }
    private static boolean solution(String str, String ending){
        return str.endsWith(ending);
    }

}
