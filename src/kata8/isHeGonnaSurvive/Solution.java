package kata8.isHeGonnaSurvive;

public class Solution {

    public static boolean hero(int bullets, int dragons) {
        return (long)dragons * 2 <= (long) bullets;
    }
}
