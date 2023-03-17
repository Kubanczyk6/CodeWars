package kata8.centuryFromYear;

public class Solution {
    public static void main(String[] args) {
        System.out.println(century(2001));
    }

    public static int century(int number) {
        return (int)Math.ceil((double)number/100);
    }
}
