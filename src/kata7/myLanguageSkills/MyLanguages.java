package kata7.myLanguageSkills;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyLanguages {
    public static void main(String[] args) {
        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Slovak", 4);
        map1.put("Arabic", 87);
        map1.put("French", 86);
        map1.put("Hungarian", 87);
        map1.put("Croatian", 31);
        map1.put("Irish", 74);
        System.out.println(myLanguages(map1));
    }

    public static List<String> myLanguages(final Map<String, Integer> results) {
        System.out.println(results);

        List<String> list = new LinkedList<>();
        List<Integer> collect = results.values().stream().sorted().filter(i -> i >= 60).toList();
List<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < collect.size(); i++) {
           list1.add(collect.get(collect.size()-1-i));
        }


        for (Integer integer : list1) {
            for (String s : results.keySet()) {
                if(results.get(s).equals(integer)){
                    if(!list.contains(s)){
                        list.add(s);
                        break;
                    }

                }
            }
        }

        return list;
    }
}


