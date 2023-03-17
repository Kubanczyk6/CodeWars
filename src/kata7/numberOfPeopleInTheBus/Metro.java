package kata7.numberOfPeopleInTheBus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Metro {
    public static void main(String[] args) {
     ArrayList<int[]> list = new ArrayList<>();
     list.add(new int[] {10,0});
     list.add(new int[] {3,5});
     list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
    }
    private static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(i->i[0]-i[1]).sum();
    }
}


