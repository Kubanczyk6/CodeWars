package kata7.onesAndZeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {
    public static void main(String[] args) {
        System.out.println(convert(new ArrayList<>(Arrays.asList(1,0,0,1,1,0,1))));
    }
    public static int convert(List<Integer> binary){
        int result = 0;
        for (int i = binary.size() - 1; i >= 0; i--) {
            result += binary.get(binary.size ()-1-i)==1?(int) Math.pow(2, i):0;
        }
        return result;
    }
}
