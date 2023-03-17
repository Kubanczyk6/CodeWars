package kata6.areTheyTheSame;

import java.util.Arrays;

public class AreSame {

    public static void main(String[] args) {
        System.out.println(comp(new int[]{-121, -144, 19, -161,19, -144, 19, -11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
    }
    public static boolean comp(int[] a, int[] b) {

        if(a==null||b==null||a.length!=b.length){
            return false;
        }
        int index=0;

        int[] intsa = Arrays.stream(a).map(i -> Math.abs(i)).toArray();
        int[] intsb = Arrays.stream(b).map(i -> Math.abs(i)).toArray();

        Arrays.sort(intsa);
        Arrays.sort(intsb);


        for (int i = 0; i < a.length; i++) {
            if(intsb[i]!=Math.pow(intsa[i], 2)){
                return false;
            }
        }
        return true;
    }
}
