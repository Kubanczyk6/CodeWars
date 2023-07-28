package kata7.kookaCounter;

public class Dinglemouse {
    public static void main(String[] args) {
        System.out.println(kookaCounter("hahahahaha"));
    }


    public static int kookaCounter(final String laughing) {
        if(laughing.length()==0){
            return 0;
        }
        int counter = 1;

        for (int i = 0; i < laughing.length() - 4; i += 2) {
            String checkFirstGender = laughing.substring(i, i + 2);
            String checkSecondGender = laughing.substring(i + 2, i + 4);
            if (!checkFirstGender.equals(checkSecondGender)) {
                counter++;
            }
        }
        return counter;
    }}
