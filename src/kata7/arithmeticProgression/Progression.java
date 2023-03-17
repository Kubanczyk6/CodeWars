package kata7.arithmeticProgression;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Progression{
    public static void main(String[] args) {
        System.out.println(arithmeticSequenceElements(1,2,5));
    }


    public static String arithmeticSequenceElements(int a, int d, long n) {

    return Stream.iterate(a,i->i+d)
            .limit(n)
            .map(String::valueOf)
            .collect(Collectors.joining(", "));
}
        }
