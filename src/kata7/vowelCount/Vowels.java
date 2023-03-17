package kata7.vowelCount;

public class Vowels {
    public static void main(String[] args) {
        String a = "aba yuoshaa";
        System.out.println(getCount(a));
    }
    private static int getCount(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                counter++;
            }
        }
        return counter;
    }
}
