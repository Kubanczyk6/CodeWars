package kata7.minimumSteps;

import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {
        System.out.println(minimumSteps(new int[]{19,98,69,28,75,45,17,98,67}, 464));
    }
    public static int minimumSteps(int[] numbers, int k) {
        Arrays.sort(numbers);
        int sum = 0;
        int counter = 0;
        for (int number : numbers) {
            sum += number;
            if (sum >= k) {
                return counter;
            }
            counter++;
        }
        return 1;
    }
}
