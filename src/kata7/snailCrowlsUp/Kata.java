package kata7.snailCrowlsUp;

public class Kata {
    public static void main(String[] args) {
        System.out.println(snail(3,2,1));
    }

    public static int snail(int column, int day, int night) {
        int counter=1;
        while(true){
            column-=day;
            if(column<=0){
                return counter;
            }
            column+=night;
            counter++;
        }
    }
}
