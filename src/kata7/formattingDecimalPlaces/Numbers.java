package kata7.formattingDecimalPlaces;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(twoDecimalPlaces(231213.12124));

    }

    public static double twoDecimalPlaces(double number)
    {
        //Write your code here
        String[] decimal = String.valueOf(number).split("\\.");
        return Double.parseDouble(String.format("%s%s%s",
                decimal[0],
                ".",
                decimal[1].length()>2?decimal[1].substring(0,2):decimal[1]));
    }
}
