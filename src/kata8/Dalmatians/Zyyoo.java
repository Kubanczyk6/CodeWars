package kata8.Dalmatians;

public class Zyyoo {

    public static void main(String[] args) {
        System.out.println(howManyDalmations(8));
    }
    public static String howManyDalmations(int number) {

    String[] dogs= new String[] {"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIONS!!!"};

    return number<10?dogs[0]:number<50?dogs[1]:number<101?dogs[2]:dogs[3];
}

}
