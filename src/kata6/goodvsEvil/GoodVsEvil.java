package kata6.goodvsEvil;

import java.util.Arrays;

public class GoodVsEvil {
    public static void main(String[] args) {
        System.out.println(battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }
    public static String battle(String goodAmounts, String evilAmounts) {
        String[] goodArray = Arrays.stream(goodAmounts.split(" ")).toArray(String[]::new);
        String[] evilArray = Arrays.stream(evilAmounts.split(" ")).toArray(String[]::new);
        int goodForces = 0;
        int evilForces = 0;

        for (int i = 0; i < goodArray.length; i++) {
            switch(i){
                case 0->goodForces+=Integer.parseInt(goodArray[i]);
                case 1->goodForces+=Integer.parseInt(goodArray[i])*2;
                case 2,3->goodForces+=Integer.parseInt(goodArray[i])*3;
                case 4->goodForces+=Integer.parseInt(goodArray[i])*4;
                case 5->goodForces+=Integer.parseInt(goodArray[i])*10;
            }
        }

        for (int i = 0; i < evilArray.length; i++) {
            switch(i){
                case 0->evilForces+=Integer.parseInt(evilArray[i]);
                case 1,2,3->evilForces+=Integer.parseInt(evilArray[i])*2;
                case 4->evilForces+=Integer.parseInt(evilArray[i])*3;
                case 5->evilForces+=Integer.parseInt(evilArray[i])*5;
                case 6->evilForces+=Integer.parseInt(evilArray[i])*10;
            }
        }

        return goodForces==evilForces?"Battle Result: No victor on this battle field":goodForces>evilForces?"Battle Result: Good triumphs over Evil":"Battle Result: Evil eradicates all trace of Good";
    }
}
