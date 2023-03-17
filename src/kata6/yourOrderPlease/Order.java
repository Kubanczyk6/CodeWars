package kata6.yourOrderPlease;

public class Order {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }

    public static String order(String words) {
        String[] array = words.split(" ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String arg = String.valueOf(i);

            for (String s : array) {
                if (s.contains(arg)) {
                    String temp = array[Integer.parseInt(arg) - 1];
                    array[Integer.parseInt(arg) - 1] = s;
                    array[count] = temp;
                    break;
                }
                count++;
            }
            count = 0;
        }
        String result = "";
        int counter = 0;
        for (String s : array) {
            result += s;
            counter++;
            if (counter < array.length) {
                result += " ";
            }
        }
        return result;
    }

}


