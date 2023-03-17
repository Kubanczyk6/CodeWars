package kata7.oddEvenStringSort;

public class OddEvenSort {
    public static void main(String[] args) {
        System.out.println(sortMyString("CodeWars"));
    }
    public static String sortMyString(String s) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                first.append(s.charAt(i));
            } else {
                second.append(s.charAt(i));
            }
        }
        return first +" "+ second;
    }
}
