package kata8.hexToDecimal;

public class Kata {
    public static void main(String[] args) {
        System.out.println(hexToDec("-C"));
    }

    public static int hexToDec(final String hexString) {
        System.out.println(hexString);
        String[] array = new String[]{"A", "B", "C", "D", "E", "F"};

        int result = 0;
        for (int i = hexString.length() - 1; i >= 0; i--) {
            switch (hexString.charAt(hexString.length() - i - 1)) {
                case 'A', 'a' -> result += 10 * Math.pow(16, i);
                case 'B', 'b' -> result += 11 * Math.pow(16, i);
                case 'C', 'c' -> result += 12 * Math.pow(16, i);
                case 'D', 'd' -> result += 13 * Math.pow(16, i);
                case 'E', 'e' -> result += 14 * Math.pow(16, i);
                case 'F', 'f' -> result += 15 * Math.pow(16, i);
                case '-' -> result=result;
                default -> result += Integer.parseInt(String.valueOf(hexString.charAt(hexString.length() - i - 1))) * Math.pow(16, i);
            }
        }
        return hexString.charAt(0)=='-'?-result:result;
    }
}
