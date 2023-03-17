package kata8.subtractTheSum;

import java.util.List;
import java.util.Map;

public class Kata {
    public static void main(String[] args) {
        System.out.println(subtractSum(10));
    }

    public static String subtractSum(int n) {

        List<String> list = List.of("kiwi",
                "pear",
                "kiwi",
                "banana",
                "melon",
                "banana",
                "melon",
                "pineapple",
                "apple",
                "pineapple",
                "cucumber",
                "pineapple",
                "cucumber",
                "orange",
                "grape",
                "orange",
                "grape",
                "apple",
                "grape",
                "cherry",
                "pear",
                "cherry",
                "pear",
                "kiwi",
                "banana",
                "kiwi",
                "apple",
                "melon",
                "banana",
                "melon",
                "pineapple",
                "melon",
                "pineapple",
                "cucumber",
                "orange",
                "apple",
                "orange",
                "grape",
                "orange",
                "grape",
                "cherry",
                "pear",
                "cherry",
                "pear",
                "apple",
                "pear",
                "kiwi",
                "banana",
                "kiwi",
                "banana",
                "melon",
                "pineapple",
                "melon",
                "apple",
                "cucumber",
                "pineapple",
                "cucumber",
                "orange",
                "cucumber",
                "orange",
                "grape",
                "cherry",
                "apple",
                "cherry",
                "pear",
                "cherry",
                "pear",
                "kiwi",
                "pear",
                "kiwi",
                "banana",
                "apple",
                "banana",
                "melon",
                "pineapple",
                "melon",
                "pineapple",
                "cucumber",
                "pineapple",
                "cucumber",
                "apple",
                "grape",
                "orange",
                "grape",
                "cherry",
                "grape",
                "cherry",
                "pear",
                "cherry",
                "apple",
                "kiwi",
                "banana",
                "kiwi",
                "banana",
                "melon",
                "banana",
                "melon",
                "pineapple",
                "apple",
                "pineapple");

        int temp = n;
        do {
            while (temp > 0) {
                int temp1 = temp % 10;
                temp /= 10;
                n -= temp1;
            }
            temp = n;
        } while (n > 100);


        return list.get(n-1);
    }
}
