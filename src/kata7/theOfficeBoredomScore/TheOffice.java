package kata7.theOfficeBoredomScore;

import java.util.HashMap;
import java.util.Map;

public class TheOffice {
    public static void main(String[] args) {
        Person[] array = new Person[]{

                new Person("tim", "change"),
                new Person("jim", "accounts"),
                new Person("randy", "canteen"),
                new Person("sandy", "change"),
                new Person("andy", "change"),
                new Person("katie", "IS"),
                new Person("laura", "change"),
                new Person("saajid", "IS"),
                new Person("alex", "trading"),
                new Person("john", "accounts"),
                new Person("mr", "finance")
        };
        System.out.println(boredom(array));
    }


    public static String boredom(Person[] staff) {
        Map<String, Integer> map = new HashMap<>();
        map.put("accounts", 1);
        map.put("finance", 2);
        map.put("canteen", 10);
        map.put("regulation", 3);
        map.put("trading", 6);
        map.put("change", 6);
        map.put("IS", 8);
        map.put("retail", 5);
        map.put("cleaning", 4);
        map.put("pissing about", 25);
        int result = 0;

        for (Person person : staff) {
            result += map.get(person.department);
        }
        return result >= 100 ? "party time!!" : result > 80 ? "i can handle this" : "kill me now";
    }
}
