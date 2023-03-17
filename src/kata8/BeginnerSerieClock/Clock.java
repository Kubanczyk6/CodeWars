package kata8.BeginnerSerieClock;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class Clock {
    public static void main(String[] args) {
        System.out.println(Past(0,1,1));
    }
    public static int Past(int h, int m, int s)
    {

       return h*3600000+m*60000+s*1000;
    }
}
