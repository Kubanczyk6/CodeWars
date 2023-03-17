package kata8.countingSheep;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Counter {
    public static void main(String[] args) {
        System.out.println(countSheeps(new Boolean[]{null, true}));
    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        List<Boolean> list = new LinkedList<>();

        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if(arrayOfSheep!=null){
                list.add(arrayOfSheep);
        }
        }
        return (int) list.stream().filter(i->i).count();
    }
}
