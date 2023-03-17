package kata7.correctTheTimeString;

public class Solution {
    public static void main(String[] args) {
        System.out.println(timeCorrect("52:99:09"));
    }

    public static String timeCorrect(String timestring) {
        System.out.println(timestring);

        if (timestring == null || timestring.length() != 8 || timestring.split(":").length != 3) {
            return null;
        }

        for (int i = 0; i < timestring.length(); i++) {
            if (!Character.isDigit(timestring.charAt(i)) && timestring.charAt(i) != ':') {
                return null;
            }
        }
        String[] array = timestring.split(":");
        int seconds = Integer.parseInt(array[2]) >= 60 ? Integer.parseInt(array[2]) % 60 : Integer.parseInt(array[2]);
        array[1] = Integer.parseInt(array[2]) >= 60 ? String.valueOf(Integer.parseInt(array[1]) + 1) : array[1];
        int minutes = Integer.parseInt(array[1]) >= 60 ? Integer.parseInt(array[1]) % 60 : Integer.parseInt(array[1]);
        array[0] = Integer.parseInt(array[1]) >= 60 ? String.valueOf(Integer.parseInt(array[0]) + 1) : array[0];
        int hours = Integer.parseInt(array[0]) >= 24 ? Integer.parseInt(array[0]) %24 : Integer.parseInt(array[0]);

        String formattedSeconds = seconds < 10 ? "0" + seconds : "" + seconds;
        String formattedMinutes = minutes < 10 ? "0" + minutes : "" + minutes;
        String formattedHours = hours < 10 ? "0" + hours : "" + hours;

        return String.format("%s:%s:%s", formattedHours, formattedMinutes, formattedSeconds);
    }
}
