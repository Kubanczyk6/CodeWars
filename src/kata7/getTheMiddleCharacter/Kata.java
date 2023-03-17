package kata7.getTheMiddleCharacter;

public class Kata {

    public static void main(String[] args) {
        System.out.println(getMiddle("middle"));
    }
    private static String getMiddle(String word){
        int beginIndex = (word.length() - 1) / 2;
        int beginIndex1 = word.length() / 2;
        return word.length()%2==0?word.substring(beginIndex,word.length()-beginIndex):word.substring(beginIndex1, beginIndex1 +1);

    }
}
