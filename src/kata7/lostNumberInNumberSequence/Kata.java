package kata7.lostNumberInNumberSequence;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(findDeletedNumber(new int[]{1,2,3,4,5}, new int[]{1,2,3,4}));
    }
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        System.out.println(Arrays.toString(mixedArr));
        System.out.println(Arrays.toString(arr));
        if(mixedArr.length==0&&arr.length==0||arr.length==mixedArr.length){
            return 0;
        } else if(arr.length<=mixedArr.length){
            return arr[0];
        }
        Arrays.sort(mixedArr);
        for (int i = 0; i < mixedArr.length; i++) {
            if (arr[i] != mixedArr[i]) {
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}
