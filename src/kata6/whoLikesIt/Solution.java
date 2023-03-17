package kata6.whoLikesIt;

public class Solution {
    public static void main(String[] args) {
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
    private static String whoLikesIt(String... names) {
        if (names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }

        for (int i = 0; i < names.length; i++) {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }

        return "no one likes this";
    }
}
