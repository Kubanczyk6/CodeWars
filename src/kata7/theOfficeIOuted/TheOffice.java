package kata7.theOfficeIOuted;

import java.util.Arrays;

public class TheOffice {
    public static void main(String[] args) {
        Person[] meet = new Person[]{
                new Person("tim", 0),
                new Person("jim", 2),
                new Person("randy", 0),
                new Person("sandy", 7),
                new Person("andy", 0),
                new Person("katie", 5),
                new Person("laura", 1),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 0)
        };
        System.out.println(outed(meet, "sandy"));
    }

    public static String outed(Person[] meet, String boss) {
        System.out.println(Arrays.toString(meet));
        System.out.println(boss);
        double happiness = 0;
        for (Person person : meet) {
            if (boss.equals(person.name)) {
                happiness += person.happiness * 2;
            } else {
                happiness += person.happiness;
            }
        }
        return happiness / meet.length <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }
}
