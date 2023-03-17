package kata6.sumOfParts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumParts {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumParts(new int[] {744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358})));
    }

    public static int[] sumParts(int[] ls) {

        List<Integer> list=new ArrayList<>(Arrays.stream(ls).collect(ArrayList::new, ArrayList::add, ArrayList::addAll));
        List<Integer> list1 = new ArrayList<>();

        while(list.size()>0){
            list1.add(list.stream().mapToInt(x->x).sum());
            list.remove(0);
        }
        list1.add(0);
        return list1.stream().mapToInt(i->i).toArray();
    }
}
