package kata7.findScreenSize;

public class Kata {

    public static void main(String[] args) {
        System.out.println(findScreenHeight(3840,"32:9"));
    }

    public static String findScreenHeight(int width, String ratio) {
        return String.format("%sx%s",
                width,
                (int)    (width/Double.parseDouble(ratio.split(":")[0])*Integer.parseInt(ratio.split(":")[1])));
    }
}
