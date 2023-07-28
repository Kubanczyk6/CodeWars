package kata8.removeTheTime;

public class Solution {
    public static void main(String[] args) {
        System.out.println(shortenToDate("Friday May 2, 9am"));
    }

    public static String shortenToDate(String longDate) {

        return longDate.substring(0,longDate.indexOf(","));
    }
}
