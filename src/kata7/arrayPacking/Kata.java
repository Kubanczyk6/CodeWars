package kata7.arrayPacking;

public class Kata {
    private static long arrayPacking(int[]array){
        char[]arr=new char[array.length*8];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            for (int j = 0; j < 8; j++) {
                counter++;
                if(a%2==0){

                }
            }
        }
        return 0;
    }
}
