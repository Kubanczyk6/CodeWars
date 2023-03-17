package kata7.compareStringsBySumOfChairs;

public class Kata {
    public static void main(String[] args) {
        System.out.println(compare("aa", "ffPFF"));
    }

    public static boolean compare(String s1, String s2) {
        if(s1==null||s2==null){
            return true;
        }

        s1=s1.replaceAll("[^A-Za-z]","");
        s2=s2.replaceAll("[^A-Za-z]","");
        return countSumOfChars(s1)==countSumOfChars(s2)||s1.length()==0||s2.length()==0;
    }

    private static int countSumOfChars(String s1) {
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            sum+= s1.toUpperCase().charAt(i);
        }
        return sum;
    }
}
