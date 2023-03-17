package kata7.dontGiveMeFive;

public class Kata {
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(4,17));
    }
    private static int dontGiveMeFive(int start, int end){
        int counter=0;
        for (int i = start; i <=end ; i++) {
            if(!String.valueOf(i).contains("5")){
                counter++;
            }
        }
        return counter;
    }
}
