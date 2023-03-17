package kata7.unluckyDays;

import java.time.Year;

public class Kata {
    public static void main(String[] args) {
        System.out.println(unluckyDays(1812));
    }


    public static int unluckyDays(int year) {


        return !Year.isLeap(year) ?
                switch (Year.of(year).atDay(1).getDayOfWeek()) {
            case MONDAY, TUESDAY, SUNDAY -> 2;
            case WEDNESDAY, FRIDAY, SATURDAY -> 1;
            case THURSDAY -> 3;
        } :
                switch (Year.of(year).atDay(1).getDayOfWeek()) {
            case MONDAY, WEDNESDAY, THURSDAY -> 2;
            case TUESDAY, FRIDAY, SATURDAY -> 1;
            case SUNDAY -> 3;
        };
    }
}







