package kata5.directionsReduction;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DirReduction {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"})));
    }

    private static String[] dirReduc(String[] arr) {

        List<String> list = new LinkedList<>(Arrays.asList(arr));

        for (int i = 0; i < list.size(); i++) {
            if (list.size()>0&& i < list.size() - 1&&"NORTH".equals(list.get(i))  && list.contains("SOUTH") && "SOUTH".equals(list.get(i+1))) {
                list.remove(i+1);
                list.remove(i);
            }
            if (list.size()>0&& i < list.size() - 1&&"SOUTH".equals(list.get(i)) && list.contains("NORTH") && "NORTH".equals(list.get(i+1))) {
                list.remove(i+1);
                list.remove(i);
            }
            if (list.size()>0&& i < list.size() - 1&&"WEST".equals(list.get(i)) && list.contains("EAST") &&  "EAST".equals(list.get(i+1))) {
                list.remove(i+1);
                list.remove(i);
            }
            if (list.size()>0&& i < list.size() - 1&&"EAST".equals(list.get(i)) && list.contains("WEST") && "WEST".equals(list.get(i+1))) {
                list.remove(i+1);
                list.remove(i);
            }
        }
        int counter=0;
        for (int i = 0; i < list.size()-1; i++) {
            if("NORTH".equals(list.get(i))&&"SOUTH".equals(list.get(i+1))
                    ||"SOUTH".equals(list.get(i))&&"NORTH".equals(list.get(i+1))
                    || "WEST".equals(list.get(i))&&"EAST".equals(list.get(i+1))
                    ||"EAST".equals(list.get(i))&&"WEST".equals(list.get(i+1))){
                counter++;
            }
        }

        return counter>0?dirReduc(Arrays.copyOf(list.toArray(), list.size(), String[].class)): Arrays.copyOf(list.toArray(), list.size(), String[].class) ;

}}







