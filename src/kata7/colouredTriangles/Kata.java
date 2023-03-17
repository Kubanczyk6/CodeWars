package kata7.colouredTriangles;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
        System.out.println(triangle("B"));
    }

    public static char triangle(final String row) {
        System.out.println(row);
        List<Character> list = new LinkedList<>();

        for (int i = 0; i < row.length() - 1; i++) {
            if (row.charAt(i) == row.charAt(i + 1)) {
                list.add(row.charAt(i));
            }
            if (row.charAt(i) == 'B' && row.charAt(i + 1) == 'G' || row.charAt(i) == 'G' && row.charAt(i + 1) == 'B') {
                list.add('R');
            }
            if (row.charAt(i) == 'R' && row.charAt(i + 1) == 'G' || row.charAt(i) == 'G' && row.charAt(i + 1) == 'R') {
                list.add('B');
            }
            if (row.charAt(i) == 'B' && row.charAt(i + 1) == 'R' || row.charAt(i) == 'R' && row.charAt(i + 1) == 'B') {
                list.add('G');
            }
        }
        StringBuilder a = new StringBuilder();
        for (Character character : list) {
            a.append(character);
        }


        return a.length() > 1 ? triangle(a.toString()) : a.length() == 0 ? row.charAt(0) : list.get(0);


//
//        while(list.size()>1){
//            if(list.get(0)==list.get(1)){
//                list.remove(0);
//            }
//            if(list.get(list.size()-1)==list.get(list.size()-2)){
//                list.remove()
//            }
//        }
//
//
//        for (int i = 0; list.size()>1 ; i++) {
//            if(list.get(i)==list.get(i+1))
//        }

    }
    // Return the answer

}
