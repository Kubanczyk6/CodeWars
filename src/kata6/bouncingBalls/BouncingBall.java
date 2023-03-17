package kata6.bouncingBalls;

public class BouncingBall {
    public static void main(String[] args) {
        System.out.println(bouncingBall(2,0.8,1.5));
    }

    public static int bouncingBall(double h, double bounce, double window) {
if(h<=0||bounce<=0||bounce>=1||window>=h){
    return -1;
}
        int counter = -1;
        while (h >= window) {
            h = h * bounce;
            counter += 2;
        }


        return  counter;
    }
}
