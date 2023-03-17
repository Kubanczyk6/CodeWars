package kata7.growingPlant;

public class SimpleFun {
    public static void main(String[] args) {
        System.out.println(growingPlant(100, 10, 910));

    }
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight){
int grow=0;
        for (int day = 0;  ;) {
            day++;
            grow+=upSpeed;
            if(grow >=desiredHeight){
                return day;
            }
            grow-=downSpeed;
        }
    }
}
