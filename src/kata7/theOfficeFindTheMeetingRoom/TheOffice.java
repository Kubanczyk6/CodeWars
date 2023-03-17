package kata7.theOfficeFindTheMeetingRoom;

import java.util.stream.Stream;

public class TheOffice {
    public static void main(String[] args) {
        System.out.println(meeting(new char[] {'X','X','X','X','X'}));
    }

    public static Object meeting(char[] x) {
        int counter=0;
        for (char c : x) {
            if(c=='O'){
                return counter;
            }
            counter++;
        }

        return "None available!";
    }
}
