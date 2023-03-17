package kata8.sharkPontoon;

public class SharkPontoon {
    public static void main(String[] args) {
        System.out.println(shark(20,
                24,
                4,
                5,
        false));
    }

    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {

        double slowShark = dolphin ? sharkSpeed / 2. : sharkSpeed;
        return (double) pontoonDistance / youSpeed < sharkDistance / slowShark ? "Alive" : "Shark Bait!";


    }
}
