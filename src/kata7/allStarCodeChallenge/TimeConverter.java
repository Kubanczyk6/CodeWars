package kata7.allStarCodeChallenge;

public class TimeConverter {
    public static void main(String[] args) {
        System.out.println(toTime(323500));
    }

    public static String toTime(int seconds){
        return String.format("%s hour(s) and %s minute(s)",seconds/3600,seconds%3600/60);
    }
}
