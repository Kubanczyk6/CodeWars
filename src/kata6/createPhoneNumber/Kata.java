package kata6.createPhoneNumber;

public class Kata {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    private static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "(";
        for (int i = 0; i < numbers.length; i++) {
            if (i < 3) {
                phoneNumber += numbers[i];
            } else if (i == 3) {
                phoneNumber += ") " + numbers[i];
            } else if (i < 6) {
                phoneNumber += numbers[i];
            } else if (i == 6) {
                phoneNumber += "-" + numbers[i];
            } else {
                phoneNumber += numbers[i];
            }
        }
        return phoneNumber;
    }
}
