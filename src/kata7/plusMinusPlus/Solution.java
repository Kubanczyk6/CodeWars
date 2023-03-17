package kata7.plusMinusPlus;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(signChange(new int[] {1, -2, -7, -4, 4, -2, 0, -3, 3}));
    }

    public static int signChange(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int counter=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<0&&arr[i+1]>=0||arr[i]>=0&&arr[i+1]<0){
                counter++;
            }
        }
        return counter;
    }
}
