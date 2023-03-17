package kata7.creditCardIssuerChecker;

import java.util.List;

public class Kata {


    public static void main(String[] args) {
        System.out.println(getIssuer("9111111111111111"));
    }

    public static String getIssuer(String cardNumber) {
        return cardNumber.startsWith("34") || cardNumber.startsWith("37") && cardNumber.length() == 15 ? "AMEX" :
                cardNumber.startsWith("6011") && cardNumber.length() == 16 ? "Discover" :
                        cardNumber.startsWith("51") || cardNumber.startsWith("52") || cardNumber.startsWith("53") || cardNumber.startsWith("54") || cardNumber.startsWith("55") && cardNumber.length() == 16 ? "Mastercard" :
                                cardNumber.startsWith("4") && (cardNumber.length() == 13 || cardNumber.length() == 16) ? "VISA" : "Unknown";

    }
}
