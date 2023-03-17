package kata7.palindromeChainLength;

public class Palindromes {
    public static void main(String[] args) {
        System.out.println(palindromeChainLength(1317544822));
    }

    public static int palindromeChainLength(long n) {
        System.out.println(n);

        if (String.valueOf(n).equals(new StringBuilder(String.valueOf(n)).reverse().toString())) {
            return 0;
        }


        boolean isPalindrom = true;
        String a = String.valueOf(Math.abs(n));
        String b = new StringBuilder(a).reverse().toString();
        long result = Long.parseLong(a) + Long.parseLong(b);
        String finals = String.valueOf(result);

        for (int i = 0; i < finals.length() / 2; i++) {
            if (finals.charAt(i) != finals.charAt(finals.length() - 1 - i)) {
                isPalindrom = false;
            }
        }


        return isPalindrom ? 1 : palindromeChainLength(result) + 1;
    }
}
