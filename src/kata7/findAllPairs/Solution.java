package kata7.findAllPairs;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(duplicates(new int[]{1, 2, 2, 20, 6, 20, 2, 6, 2}));
    }

    public static int duplicates(int[] array) {
        Arrays.sort(array);
        int counter=0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]==array[i+1]){
                counter++;
                i++;
            }
        }

        return counter;
    }
}
