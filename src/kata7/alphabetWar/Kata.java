package kata7.alphabetWar;

public class Kata {
    public static String alphabetWar(String fight) {

        int rightsSide = 0;
        int leftSide = 0;

        for (int i = 0; i < fight.length(); i++) {
            if (fight.charAt(i) == 'w') {
                leftSide += 4;
            } else if (fight.charAt(i) == 'p') {
                leftSide += 3;
            } else if (fight.charAt(i) == 'b') {
                leftSide += 2;
            } else if (fight.charAt(i) == 's') {
                leftSide += 1;
            } else if (fight.charAt(i) == 'm') {
                rightsSide += 4;
            } else if (fight.charAt(i) == 'q') {
                rightsSide += 3;
            } else if (fight.charAt(i) == 'd') {
                rightsSide += 2;
            } else if (fight.charAt(i) == 'z') {
                rightsSide += 1;
            }
        }
        return rightsSide == leftSide ? "Let's fight again!" : rightsSide > leftSide ? "Right side wins!" : "Left side wins!";
    }
}
