package kata4.humanReadableDurationFormat;

import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class TimeFormatter {
    public static void main(String[] args) {
        System.out.println(formatDuration(345354587));
    }

    public static String formatDuration(int seconds) {
        int years = seconds / 31536000;
        int days = seconds % 31536000 / 86400;
        int hours = seconds % 86400 / 3600;
        int minutes = seconds % 3600 / 60;
        int second = seconds % 60;

        String year = years == 1 ? years + " year" : years > 1 ? years + " years" : "";
        String day = days == 1 ? days + " day" : days > 1 ? days + " days" : "";
        String hour = hours == 1 ? hours + " hour" : hours > 1 ? hours + " hours" : "";
        String minute = minutes == 1 ? minutes + " minute" : minutes > 1 ? minutes + " minutes" : "";
        String secon = second == 1 ? second + " second" : second > 1 ? second + " seconds" : "";

        List<String> list = new LinkedList<>();
        list.add(year);
        list.add(day);
        list.add(hour);
        list.add(minute);
        list.add(secon);
        list.removeIf(""::equals);

        if (list.size() == 1) {
            return list.get(0);
        }

        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                result += " and " + list.get(i);
            } else if (i < list.size() - 2) {
                result += list.get(i) + ", ";
            } else {
                result += list.get(i);
            }
        }
        return seconds == 0 ? "now" : result;


    }
}

