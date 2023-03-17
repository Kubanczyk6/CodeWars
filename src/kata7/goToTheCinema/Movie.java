package kata7.goToTheCinema;

import java.math.BigDecimal;

public class Movie {
    public static void main(String[] args) {
        System.out.println(movie(0,
                10,
        0.95));
    }

    public static int movie(int card, int ticket, double perc) {
        System.out.println(card);
        System.out.println(ticket);
        System.out.println(perc);
        int times = 1;
        double sum = ticket*perc;
        double priceB = card + ticket * perc;
        double priceA = ticket;
        while (Math.ceil(priceB) >= priceA) {
            sum *= perc;
            priceB += sum;
            priceA += ticket;
            times++;
        }
        return times;
    }
}