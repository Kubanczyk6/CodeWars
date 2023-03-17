package kata7.replaceEveryNth;

public class Kata {
    public static void main(String[] args) {
        System.out.println(replaceNth("Vader said: No, I am your father!", -2, 'a', 'o'));
    }


    public static String replaceNth(String text, int n, char oldValue, char newValue) {
        if(n<=0){
            return text;
        }
        int counter = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == oldValue && counter %n ==0) {
                text = text.substring(0, i) + newValue + text.substring(i + 1);
                counter++;
            } else if (text.charAt(i) == oldValue) {
                counter++;
            }
        }
        return text;
    }
}
