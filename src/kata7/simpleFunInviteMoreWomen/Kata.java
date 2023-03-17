package kata7.simpleFunInviteMoreWomen;

import java.util.Arrays;

public class Kata {
    public static boolean inviteMoreWomen(int[] l) {
        return Arrays.stream(l).filter(i->i==1).count()> l.length/2.;
    }
}
