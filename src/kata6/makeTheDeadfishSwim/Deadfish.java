package kata6.makeTheDeadfishSwim;

import java.util.Arrays;

public class Deadfish {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdosodddddiso")));
    }
    public static int[] parse(String data) {
        int count = (int) Arrays.stream(data.split("")).filter("o"::equals).count();
        int[] array = new int[count];
        int result = 0;
        int index = 0;
        for (int i = 0; i < data.length(); i++) {
            switch (data.charAt(i)) {
                case 'i' -> result++;
                case 'd' -> result--;
                case 's' -> result *= result;
                case 'o' -> {
                    array[index] = result;
                    index++;
                }
            }
        }
        return array;
    }
}
