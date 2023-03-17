package kata8.staticElectricery;

public class Dinglemouse {



    private static  int ONE_HUNDRED = 100;

    private int value=100;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }
    public static Dinglemouse INST = new Dinglemouse();

    public int plus100(int n) {
        return value + n;
    }

    public static void main(String[] args) {
Dinglemouse dinglemouse = new Dinglemouse();
        int i = Dinglemouse.INST.plus100(23);
        System.out.println(i);
    }
}
