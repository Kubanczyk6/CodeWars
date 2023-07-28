package kata7.sumOfIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//[7, 10]
//        [1, 4]
//        [3, 5]
//        [1, 2]
//        [3, 6]
//        [5, 8]
//        [10, 20]
//        [1, 6]
//        [5, 11]
//        [1, 5]
//        [16, 19]
public class Interval {
    public static void main(String[] args) {
        System.out.println(sumIntervals(new int[][]{{10, 20}, {16, 19}, {1, 6}, {5, 11}, {1, 5}}));
    }

    public static int sumIntervals(int[][] intervals) {

        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] interval : intervals) {
            if (map.containsKey(interval[0])) {
                Integer integer = map.get(interval[0]);
                if (integer < interval[1]) {
                    map.put(interval[0], interval[1]);
                }
            } else {
                map.put(interval[0], interval[1]);
            }
        }

        List<int[]> list = new ArrayList<>();
        int counter = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            int[] array = new int[]{integerIntegerEntry.getKey(), integerIntegerEntry.getValue()};
            int[] previousArray;
            if (counter > 0) {
                previousArray = list.get(counter - 1);
                if (previousArray[1] > array[0]) {
                    if (previousArray[1] > array[1]) {
                        array = new int[]{previousArray[0], previousArray[1]};
                    } else {
                        array = new int[]{previousArray[0], array[1]};
                    }
                    list.remove(previousArray);
                    counter--;
                }
            }
            list.add(array);
            counter++;
        }
        int result = 0;
        for (int[] ints : list) {
            int subtract = ints[1] - ints[0];
            result += subtract;
        }
        return result;
    }
}

//map.forEach((k, v) -> System.out.println("k: " + k + " v:" + v));
