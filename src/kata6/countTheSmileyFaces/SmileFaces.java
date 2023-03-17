package kata6.countTheSmileyFaces;

import java.util.ArrayList;
import java.util.List;

public class SmileFaces {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        System.out.println(countSmileys(a));
    }

    public static int countSmileys(List<String> arr) {

        return (int) (arr.stream()
                .filter(i -> i.charAt(0) == ';' || i.charAt(0) == ':')
                .filter(i -> i.charAt(1) == ')' || i.charAt(1) == 'D')
                .filter(i -> i.length() == 2).count()
                + arr.stream()
                .filter(i -> i.charAt(0) == ';' || i.charAt(0) == ':')
                .filter(i -> i.charAt(1) == '-' || i.charAt(1) == '~')
                .filter(i -> i.charAt(2) == 'D' || i.charAt(2) == ')')
                .filter(i -> i.length() == 3).count());

    }}
