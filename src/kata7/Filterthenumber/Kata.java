package kata7.Filterthenumber;

public class Kata {
    public static void main(String[] args) {
        System.out.println(filterString("as47hd5sf8j7"));
    }

    public static long filterString(final String value) {
        char[] chars = value.toCharArray();
        String first = "";
        for (char aChar : chars) {
            try {
                String aChars = String.valueOf(aChar);
                Long.parseLong(aChars);
                first += aChar;
            } catch (Exception e) {
            }
        }
        long number = Long.parseLong(first);
        return number;
    }
}
