package kata8.duckDuckGoose;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Kat {
    public static void main(String[] args) {
       duckDuckGoose(new String[]{"one", "two", "three", "four", "five"});
    }

    public static void duckDuckGoose(String[]s1) {
        String[]array=new String[s1.length/2];
        String[]array1=new String[s1.length- array.length];

        for (int i = 0; i < s1.length ; i++) {
            if(i<array.length){
                array[i]=s1[i];
            } else{
                array1[i- array.length]=s1[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));

    }
}
