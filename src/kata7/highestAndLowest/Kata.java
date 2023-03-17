package kata7.highestAndLowest;

public class Kata {
    public static void main(String[] args) {
        System.out.println(highAndLow("-999 5 7 -856"));
    }

    private static String highAndLow(String numbers) {
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;

        int whiteSpaces = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == ' ') {
                whiteSpaces++;
            }
        }
        String[] array = new String[whiteSpaces + 1];
        int counter = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) != ' ') {
                counter++;
            }
            for (int j = 0; j < counter; j++) {
                if (numbers.charAt(i) == ' ' || i == numbers.length() - 1) {
                    for (int k = 0; k < array.length; k++) {
                        if (array[k] == null) {
                            if (i == numbers.length() - 1) {
                                array[k] = numbers.substring(i - counter + 1, i + 1);
                            } else {
                                array[k] = numbers.substring(i - counter, i);
                                break;
                            }

                        }
                    }
                    counter = 0;
                    break;
                }
            }
        }
        for (String s : array) {
            if (max < Integer.parseInt(s)) {
                max = Integer.parseInt(s);
            }
            if (min > Integer.parseInt(s)) {
                min = Integer.parseInt(s);
            }
        }


        return max + " " + min;
    }
}
