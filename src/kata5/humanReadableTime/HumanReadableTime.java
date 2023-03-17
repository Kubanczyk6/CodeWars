package kata5.humanReadableTime;

public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println(makeReadable(4000));
    }
    private static String makeReadable(int seconds){
        String hours = String.valueOf(seconds/3600);
        String minutes = String.valueOf(seconds%3600/60);
        String sec = String.valueOf(seconds%3600%60);
        String zero = "0";
        hours=hours.length()==1?zero+hours:hours;
        minutes=minutes.length()==1?zero+minutes:minutes;
        sec=sec.length()==1?zero+sec:sec;
        return String.format("%s:%s:%s", hours,minutes,sec);
    }
}
