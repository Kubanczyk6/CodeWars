package Animala;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Spider extends Animal{
//    @Override
//    public void someMethod() {
//        System.out.println("Call Spider");
//    }

    public static void main(String[] args) {
//        Stream<String> stream=Stream.generate(()->"zajavka");
//        Predicate<String> predicate = a->a.contains("avka");
//        System.out.println("step1");
//        boolean b = stream.anyMatch(predicate);
//        System.out.println("step2");
//        boolean b1 = stream.allMatch(predicate);
//        System.out.println("step3");
//        boolean b2 = stream.noneMatch(predicate);
//        System.out.println("step3");
        List<String> list = Arrays.asList("Szczecin","Zakopane", "Gdynia");
Stream<Integer> integerStream = Stream.of(1,5,6,2,10,2);
Stream<Integer> filtered = integerStream.filter(a->a>5);
Optional<Integer> max = filtered.max((a,b)->b-a);

    }

}
