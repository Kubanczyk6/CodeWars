package kata6.buildTower;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(towerBuilder(3)));
    }
    public static String[] towerBuilder(int nFloors)
    {
        String[]array=new String[nFloors];
int numberOfSignsAtTheTop=1;
int numberofSignsAtTheBottom=nFloors*2-1;
        for (int i = 0; i < array.length; i++) {
array[i]=" ".repeat(numberofSignsAtTheBottom/2)+"*".repeat(numberOfSignsAtTheTop)+" ".repeat(numberofSignsAtTheBottom/2);
numberOfSignsAtTheTop+=2;
numberofSignsAtTheBottom-=2;
        }
        return array;
    }
}
