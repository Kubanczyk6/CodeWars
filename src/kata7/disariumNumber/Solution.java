package kata7.disariumNumber;

public class Solution {
    public static void main(String[] args) {
        System.out.println(disariumNumber(89));
    }
    public static String disariumNumber(int number)
    {
        int result=0;
        int temp=number;
        for (int i = String.valueOf(number).length(); i>0 ; i--) {
            result+=Math.pow(temp%10,i);
            temp/=10;
        }
        return result==number?"Disarium !!":"Not !!";
    }
}
