package kata8.fakeBinary;

public class FakeBinary {
    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
    }
    public static String fakeBin(String numberString) {


        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]","1");
    }
}
